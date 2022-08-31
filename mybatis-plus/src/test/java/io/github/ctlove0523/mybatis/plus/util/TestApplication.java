package io.github.ctlove0523.mybatis.plus.util;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

@SpringBootApplication(scanBasePackages = "io.github.ctlove0523.mybatis.plus")
@MapperScan("io.github.ctlove0523.mybatis.plus.db.mapper")
public class TestApplication {

    @Value("classpath:init_tables.sql")
    private Resource initTablesResource;

    @Bean
    public HikariDataSource hikariDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setUsername("SA");
        dataSource.setPassword("");
        dataSource.setJdbcUrl("jdbc:hsqldb:mem:sakila;sql.syntax_mys=true;sql.ignore_case=true");
        dataSource.setDriverClassName("org.hsqldb.jdbcDriver");

        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(initTablesResource);

        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(dataSource);
        initializer.setDatabasePopulator(populator);
        initializer.afterPropertiesSet();

        return dataSource;
    }

    @Bean
    public SqlSessionFactory createSqlSessionFactory(HikariDataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        return sqlSessionFactoryBean.getObject();
    }
}
