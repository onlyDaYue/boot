package com.Shelf.demo;
import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.Subject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
@MapperScan("com.Shelf.demo.Dao")
@SpringBootApplication
public class TheShelfApplication {
    public static void main(String[] args) {
        SpringApplication.run(TheShelfApplication.class, args);
    }
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chainDefinition = new DefaultShiroFilterChainDefinition();
        chainDefinition.addPathDefinition("/user/home", "authc");
        return chainDefinition;
    }
    /**
     * 启用shiro的thymeleaf标签
     * @return
     */
    @Bean
    public ShiroDialect shiroDialect(){
        return new ShiroDialect();
    }
    @ModelAttribute(name = "subject")
    public Subject subject() {
        return SecurityUtils.getSubject();
    }
}
