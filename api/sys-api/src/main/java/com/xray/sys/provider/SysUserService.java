package com.xray.sys.provider;

import com.xray.sys.model.SysUser;
import feign.Param;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gyy
 * @version 1.0
 * @date 2020/1/21 10:53
 */
@FeignClient(name = "sys")
public interface SysUserService {

    @GetMapping("/getById")
    SysUser getById(@Param("id") String id);

    @PostMapping("/test")
    SysUser test(@RequestBody SysUser sysUser);
}
