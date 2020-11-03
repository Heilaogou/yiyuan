package com.itgaoshu.yiyuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itgaoshu.yiyuan.mapper")
public class YiyuanApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiyuanApplication.class, args);
    }

}
