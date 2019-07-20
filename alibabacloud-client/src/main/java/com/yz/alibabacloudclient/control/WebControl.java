package com.yz.alibabacloudclient.control;

import com.yz.alibabacloudapi.provider.IProvider;
import com.yz.alibabacloudclient.comm.CommonResponse;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoliang.fu
 * @version V1.0
 * @Package com.yz.alibabacloudclient.control
 * @Description:
 * @date 2019/7/20 11:14
 */
@RestController
@RequestMapping("/api")
public class WebControl {

    @Autowired
    private IProvider iProvider;


    @GetMapping("/dubbo/{text}")
    public CommonResponse dubbo(@PathVariable("text") String text) {
        return CommonResponse.createCommonResponse(iProvider.say(text));
    }

}
