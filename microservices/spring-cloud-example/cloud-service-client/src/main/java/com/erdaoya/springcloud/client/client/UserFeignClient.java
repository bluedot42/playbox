package com.erdaoya.springcloud.client.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 2016/12/25 21:43
 * @author erdaoya
 */
@FeignClient(value = "cloud-service-user")
public interface UserFeignClient {

    @RequestMapping(value = "/user/personalInfo",method = RequestMethod.GET)
    Object getUser(@RequestParam(value = "id") String id);
}
