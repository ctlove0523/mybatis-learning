package io.github.ctlove0523.mybatis;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.function.ConverterFileName;

import java.util.Arrays;
import java.util.Collections;

public class AutoCodeGenerator {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        String jdbcUrl = "jdbc:mariadb://localhost:3306/sakila?serverTimezone=UTC";
        String username = "root";
        String password = "0523";

        FastAutoGenerator.create(jdbcUrl, username, password)
                .globalConfig(builder -> {
                    builder.author("ctlove0523") // 设置作者
                            .disableOpenDir()
                            .fileOverride()
                            .outputDir(userDir + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("io.github.ctlove0523.mybatis.started") // 设置父包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, userDir + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(Arrays.asList("actor", "actor_info", "address", "category", "city", "country", "customer", "customer_list", "film", "film_actor", "film_category", "film_list", "film_text", "inventory", "language", "nicer_but_slower_film_list", "payment", "rental", "sales_by_film_category", "sales_by_store", "staff", "staff_list", "store")) // 设置需要生成的表名
                            .addTablePrefix("t_", "c_")
                            .entityBuilder()
                            .enableLombok()
                            .enableTableFieldAnnotation()
                            .disableSerialVersionUID()
                            .controllerBuilder()
                            .formatFileName("")
                            .serviceBuilder()
                            .convertServiceFileName(new ConverterFileName() {
                                @Override
                                public String convert(String entityName) {
                                    return entityName + ConstVal.SERVICE;
                                }
                            })
                            .mapperBuilder()
                            .fileOverride();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
