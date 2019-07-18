package com.zh.sc_ali_nacos_server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghang
 * @date 2019/3/20
 */
@RestController
@Slf4j
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        log.info("sc-ali-nacos-server：hello:{}",name);
        return "hello:" + name;
    }
}
