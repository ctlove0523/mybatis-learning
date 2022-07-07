package io.github.ctlove0523.mybatis;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.github.ctlove0523.mybatis.started.entity.Inventory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultMapperGenerator {
    public static void main(String[] args) throws Exception{
        Class<?> entityClazz = Inventory.class;
        String className = entityClazz.getSimpleName();

        List<String> lines = new ArrayList<>();
        lines.add(String.format("    <resultMap id=\"%sResultMap\" type=\"%s\">", firstCharLowercase(className), className));
        String idLineFormat = "        <id property=\"%s\" column=\"%s\" />";
        String fieldFormat = "        <result property=\"%s\" column=\"%s\"/>";
        Field[] fields = entityClazz.getDeclaredFields();
        for (Field field : fields) {
            String property = field.getName();
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof TableId) {
                    TableId tableId = (TableId) annotation;
                    String column = tableId.value();
                    lines.add(String.format(idLineFormat, property, column));
                    break;
                }

                if (annotation instanceof TableField) {
                    TableField tableField = (TableField) annotation;
                    String column = tableField.value();
                    lines.add(String.format(fieldFormat, property, column));
                }

            }
        }
        lines.add("    </resultMap>");
        System.out.println(String.join("\n",lines));

        String mapperXmlName = entityClazz.getSimpleName() + "Mapper.xml";
        File file = new File(System.getProperty("user.dir") + "/src/main/resources/mapper/" + mapperXmlName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        List<String> mapperLines = new ArrayList<>();
        mapperLines.addAll(reader.lines().collect(Collectors.toList()));
        mapperLines = mapperLines.subList(0, mapperLines.size() - 1);

        mapperLines.addAll(lines);
        mapperLines.add("</mapper>");

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        writer.write(String.join("\n", mapperLines));
        writer.flush();
    }

    private static String firstCharLowercase(String content) {
        char[] chars = content.toCharArray();
        chars[0] = Character.toLowerCase(chars[0]);
        return new String(chars);
    }
}
