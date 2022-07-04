package io.github.ctlove0523.mybatis.started;

import io.github.ctlove0523.mybatis.started.mapper.ActorMapper;
import io.github.ctlove0523.mybatis.started.mapper.AddressMapper;
import io.github.ctlove0523.mybatis.started.mapper.CategoryMapper;
import io.github.ctlove0523.mybatis.started.mapper.CityMapper;
import io.github.ctlove0523.mybatis.started.mapper.CountryMapper;
import io.github.ctlove0523.mybatis.started.mapper.FilmMapper;
import io.github.ctlove0523.mybatis.started.model.Actor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class SakilaApplication {
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        FilmMapper filmMapper = sqlSession.getMapper(FilmMapper.class);
        System.out.println(filmMapper.selectFilm(1).getRating());
    }
}
