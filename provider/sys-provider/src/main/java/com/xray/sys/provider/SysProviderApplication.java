package com.xray.sys.provider;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 11:14
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.xray")
public class SysProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SysProviderApplication.class, args);
    }

    @GetMapping("/hi")
    @SentinelResource(value="hi")
    public String hi(@RequestParam(value = "name",defaultValue = "forezp",required = false)String name){

        return "hi "+name;
    }

}
