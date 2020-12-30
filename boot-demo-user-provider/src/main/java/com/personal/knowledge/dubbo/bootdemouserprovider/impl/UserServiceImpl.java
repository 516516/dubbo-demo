package com.personal.knowledge.dubbo.bootdemouserprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.personal.knowledge.dubbo.bean.UserAddress;
import com.personal.knowledge.dubbo.service.UserService;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @program: dubbo-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-12-29 13:46
 **/
@Service
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl.....5...");
        // TODO Auto-generated method stub
        UserAddress address1 = new UserAddress(1, "北京市昌平区宏福科技园综合楼3层", "1", "李老师", "010-56253825", "Y");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区西部硅谷大厦B座3层（深圳分校）", "1", "王老师", "010-56253825", "N");
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        if(Math.random()>0.5){
            throw new RuntimeException("制造运行时异常！！！！！！！！！！");
        }
        return Arrays.asList(address1,address2);
    }
}