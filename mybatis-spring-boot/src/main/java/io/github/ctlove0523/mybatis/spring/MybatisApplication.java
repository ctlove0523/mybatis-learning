package io.github.ctlove0523.mybatis.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.github.ctlove0523.mybatis.spring"})
@MapperScan("io.github.ctlove0523.mybatis.spring.db.mapper")
@EnableAutoConfiguration
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);

    }
}
