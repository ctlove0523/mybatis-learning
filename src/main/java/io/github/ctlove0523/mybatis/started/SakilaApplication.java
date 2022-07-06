package io.github.ctlove0523.mybatis.started;

import io.github.ctlove0523.mybatis.started.mapper.ActorInfoMapper;
import io.github.ctlove0523.mybatis.started.mapper.ActorMapper;
import io.github.ctlove0523.mybatis.started.mapper.FilmMapper;
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
        FilmMapper actorInfoMapper = sqlSession.getMapper(FilmMapper.class);
        System.out.println(actorInfoMapper.selectFilmById(1).getRating());
    }
}
