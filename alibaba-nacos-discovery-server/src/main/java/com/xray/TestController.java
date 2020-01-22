package com.xray;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 9:20
 */
@Slf4j
@RestController
@RefreshScope
public class TestController {

    @Value("${system.title:2}")
    private String userName;
    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        log.info("invoked name = " + name);
        return "hello " + name;
    }


    @GetMapping("/test")
    public Object test(){
        Map<String,Object> map = new HashMap<>();
        map.put("userName",userName);
        map.put("port",port);
        return map;
    }
}
