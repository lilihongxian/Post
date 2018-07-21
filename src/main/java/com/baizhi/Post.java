package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2018/7/5.
 */

@SpringBootApplication
@MapperScan("com.baizhi.dao")
public class Post {
    public static void main(String[] args) {
        SpringApplication.run(Post.class,args);
    }
}
