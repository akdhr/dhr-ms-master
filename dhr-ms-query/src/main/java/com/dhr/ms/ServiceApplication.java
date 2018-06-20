package com.dhr.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description :注释
 * Created by duanhr30063 on 2018/5/29.
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.dhr.ms.query")
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
