package com.wu;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer//开启管理服务
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
