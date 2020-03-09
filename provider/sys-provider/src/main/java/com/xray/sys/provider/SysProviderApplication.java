package com.xray.sys.provider;

import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

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


}
