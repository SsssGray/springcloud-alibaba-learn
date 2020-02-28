package com.xray.gateway;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gyy
 * @date 2020/2/8 15:25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
}
