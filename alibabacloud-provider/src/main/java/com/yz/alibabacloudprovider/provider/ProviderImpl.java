package com.yz.alibabacloudprovider.provider;

import com.yz.alibabacloudapi.provider.IProvider;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @ClassName: com.yz.alibabacloudprovider.provider.ProviderImpl
 * @Description:
 * @author: fuzhaoliang
 * @date: 2019/7/19 17:24
 */
@Service
@org.apache.dubbo.config.annotation.Service
public class ProviderImpl implements IProvider {

    public ProviderImpl() {
        System.err.println("sssss");
    }

    @Override
    public String say(String text) {
        System.err.println("hello,word!");
        return "say";
    }
}
