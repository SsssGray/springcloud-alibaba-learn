package com.xray.sys.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 10:52
 */
@Data
public class SysUser implements Serializable {
    private String id;

    private String userName;

    private String port;
}
