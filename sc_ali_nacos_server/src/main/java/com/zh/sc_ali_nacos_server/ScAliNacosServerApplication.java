package com.zh.sc_ali_nacos_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScAliNacosServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScAliNacosServerApplication.class, args);
    }


}
