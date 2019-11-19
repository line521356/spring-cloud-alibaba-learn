package com.lucius.upms.scaaserver;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class ScaAserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaAserverApplication.class, args);
    }

}
