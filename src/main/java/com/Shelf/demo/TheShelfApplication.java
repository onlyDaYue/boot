package com.Shelf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.Shelf.demo.Dao")
@SpringBootApplication
public class TheShelfApplication {
    public static void main(String[] args) {
        SpringApplication.run(TheShelfApplication.class, args);
    }

}
