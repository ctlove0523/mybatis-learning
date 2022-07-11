package io.github.ctlove0523.mybatis.started;

import io.github.ctlove0523.mybatis.started.entity.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class CityPageQueryApplication {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        RowBounds rowBounds = new RowBounds(0, 10);
        List<City> cities = sqlSession.selectList("io.github.ctlove0523.mybatis.started.mapper.CityMapper.selectCityByRowBounds", null, rowBounds);
        System.out.println(cities.size());

    }
}
