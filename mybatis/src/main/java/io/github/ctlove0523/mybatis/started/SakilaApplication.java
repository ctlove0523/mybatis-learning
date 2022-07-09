package io.github.ctlove0523.mybatis.started;

import io.github.ctlove0523.mybatis.started.entity.City;
import io.github.ctlove0523.mybatis.started.mapper.ActorInfoMapper;
import io.github.ctlove0523.mybatis.started.mapper.ActorMapper;
import io.github.ctlove0523.mybatis.started.mapper.CityMapper;
import io.github.ctlove0523.mybatis.started.mapper.FilmMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SakilaApplication {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        List<City> cities = cityMapper.selectNames(Arrays.asList("Abha", "Acua"));
        cities.forEach(new Consumer<City>() {
            @Override
            public void accept(City city) {
                System.out.println(city.getCity());
            }
        });
    }
}
