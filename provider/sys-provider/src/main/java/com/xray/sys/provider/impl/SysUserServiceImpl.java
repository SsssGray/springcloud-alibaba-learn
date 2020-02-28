package com.xray.sys.provider.impl;

import com.xray.sys.model.SysUser;
import com.xray.sys.provider.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 11:11
 */
@RestController
@RequestMapping("sys")
@Slf4j
public class SysUserServiceImpl implements SysUserService {

    @Value("${server.port}")
    private String port;

    @Override
    public SysUser getById(String id) {
        SysUser sysUser = new SysUser();
        sysUser.setId(id);
        sysUser.setUserName("哈哈哈");
        sysUser.setPort(port);
        log.info(port+":"+id);
        return sysUser;
    }

    @Override
    public SysUser test(@RequestBody SysUser sysUser) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(port+":"+sysUser.toString());
        return sysUser;

    }
}
