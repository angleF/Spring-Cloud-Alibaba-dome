package com.yz.alibabacloudprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableDiscoveryClient
//@EnableAutoConfiguration
@SpringBootApplication(exclude = {FeignAutoConfiguration.class})
@EnableDubboConfig
public class AlibabacloudProviderApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AlibabacloudProviderApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }

}
