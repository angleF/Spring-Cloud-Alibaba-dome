package com.yz.alibabacloudclient.invoke;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.yz.alibabacloudapi.provider.IProvider;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author zhaoliang.fu
 * @version V1.0
 * @Package com.yz.alibabacloudclient.invoke
 * @Description:
 * @date 2019/7/20 14:32
 */
@Service
@Slf4j
public class ProviderSentinel implements IProvider{

    @Reference
    private IProvider iProvider;

    @Override
    @SentinelResource(value = "say",fallback = "fallback")
    public String say(String text) {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            return iProvider.say(text);
        }
        throw new RuntimeException("异常");
    }

    public String fallback(String text, Throwable ex) {
        log.info("降级函数调用...");
        log.info("异常：",ex);
        return "fallback";
    }
}
