package com.xray.order.model;

import lombok.Data;

import java.util.Date;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 14:23
 */
@Data
public class Order {
    private String id;

    private Date time;

    private String port;
}
