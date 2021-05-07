package com.erdaoya.springcloud.client.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 2017/1/13
 * @author erdaoya
 * @since 1.0
 */
@RestController
@RequestMapping("/client/trade")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/order", method = RequestMethod.GET)
    public Object getUserByRibbon(String id) {
        return restTemplate.getForEntity("http://CLOUD-SERVICE-TRADE/trade/order?id=" + id, Object.class).getBody();
    }

}
