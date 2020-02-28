package com.xray.order.provider.impl;

import com.xray.order.model.Order;
import com.xray.order.provider.OrderService;
import com.xray.sys.model.SysUser;
import com.xray.sys.provider.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 14:26
 */
@RestController
@RequestMapping("order")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public Order getById(String id) {

        SysUser sysUser= sysUserService.getById("12");

        Order order = new Order();
        order.setId(id);
        order.setPort(sysUser.getPort());
        order.setTime(new Date());
        return order;
    }
}
