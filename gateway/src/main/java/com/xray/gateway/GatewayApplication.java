package com.xray.gateway;

import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author gyy
 * @date 2020/2/8 15:25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
         SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public IRule ribbonRule() {
        return new NacosWeightedRule();
    }

}
