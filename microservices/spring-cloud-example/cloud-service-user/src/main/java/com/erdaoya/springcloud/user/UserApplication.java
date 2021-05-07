package com.erdaoya.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * 2017/1/13
 *
 * @author erdaoya
 * @since 1.0
 */
@SpringBootApplication
@ImportResource("spring/spring-boot.xml")
@ComponentScan("com.erdaoya.springcloud")
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        SpringApplication.run(UserApplication.class, args);
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("\nStart Time: " + time / 1000 + " s");
        System.out.println("...............................................................");
        System.out.println("..................Service starts successfully..................");
        System.out.println("...............................................................");
    }
}
