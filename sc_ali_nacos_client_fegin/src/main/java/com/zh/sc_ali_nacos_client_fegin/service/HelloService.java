package com.zh.sc_ali_nacos_client_fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author zhanghang
 * @date 2019/3/20
 */
@FeignClient("sc-ali-nacos-server")
public interface HelloService {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);
}
