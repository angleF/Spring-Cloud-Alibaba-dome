package com.yz.alibabacloudclient;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDubboConfig
public class AlibabacloudClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AlibabacloudClientApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }


    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

}
