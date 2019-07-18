package com.zh.sc_ali_nacos_config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhanghang
 * @date 2019/3/20
 */
@RestController
@Slf4j
@RefreshScope
public class ConfigController {

    @Value("${zh.title:}")
    private String title;

    @Value("${zh.name:}")
    private String name;

    @GetMapping("/refreshConfig")
    public String refreshConfig(){
        log.info("title当前最新值为:{}",title);
        log.info("name当前最新值为:{}",name);
        return this.title;
    }
}
