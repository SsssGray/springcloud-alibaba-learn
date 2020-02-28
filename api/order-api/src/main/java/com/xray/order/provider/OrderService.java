package com.xray.order.provider;

import com.xray.order.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 14:24
 */
@FeignClient(value = "order",path = "order")
public interface OrderService {
    @GetMapping("/getById")
    Order getById(String id);
}
