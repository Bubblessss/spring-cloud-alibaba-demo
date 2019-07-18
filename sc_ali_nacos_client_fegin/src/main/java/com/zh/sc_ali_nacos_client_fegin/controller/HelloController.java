package com.zh.sc_ali_nacos_client_fegin.controller;

import com.zh.sc_ali_nacos_client_fegin.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        log.info("sc-ali-nacos-client-fegin：hello:{}",name);
        return this.helloService.hello(name);
    }
}
