package io.github.ctlove0523.mybatis.started;

import io.github.ctlove0523.mybatis.started.mapper.ActorMapper;
import io.github.ctlove0523.mybatis.started.mapper.CityMapper;
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
        ActorMapper actorMapper = sqlSession.getMapper(ActorMapper.class);
        System.out.println(actorMapper.selectActor(1));
        CityMapper cityMapper = sqlSession.getMapper(CityMapper.class);
        System.out.println(cityMapper.selectById(1).getCity());
    }
}
