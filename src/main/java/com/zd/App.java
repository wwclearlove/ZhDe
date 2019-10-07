package com.zd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */


@MapperScan(basePackages = "com.zd.mapper")
@SpringBootApplication
public class App {
    public static void main( String[] args )
    {
        //启动方式2
        SpringApplication.run(App.class,args);
    }
}
