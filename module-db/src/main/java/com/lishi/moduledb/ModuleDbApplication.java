package com.lishi.moduledb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lishi.moduledb.dao")
public class ModuleDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleDbApplication.class, args);
    }

}

