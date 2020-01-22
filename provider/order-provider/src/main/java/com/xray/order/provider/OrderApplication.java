package com.xray.order.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 14:44
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients("com.xray")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
