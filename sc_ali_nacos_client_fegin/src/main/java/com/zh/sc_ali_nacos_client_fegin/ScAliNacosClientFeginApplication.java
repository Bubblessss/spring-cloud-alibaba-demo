package com.zh.sc_ali_nacos_client_fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ScAliNacosClientFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScAliNacosClientFeginApplication.class, args);
    }

}
