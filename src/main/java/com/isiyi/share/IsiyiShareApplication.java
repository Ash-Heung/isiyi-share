package com.isiyi.share;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.isiyi.share.mapper")
public class IsiyiShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(IsiyiShareApplication.class, args);
    }

}
