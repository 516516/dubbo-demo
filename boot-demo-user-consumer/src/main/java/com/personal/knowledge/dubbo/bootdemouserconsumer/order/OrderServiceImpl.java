package com.personal.knowledge.dubbo.bootdemouserconsumer.order;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.personal.knowledge.dubbo.bean.UserAddress;
import com.personal.knowledge.dubbo.service.OrderService;
import com.personal.knowledge.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @program: dubbo-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-12-29 14:04
 **/
@Service
public class OrderServiceImpl implements OrderService {

//    @Autowired
    @Reference(loadbalance = "roundrobin",timeout = 1000)
    UserService userService;

    @HystrixCommand(fallbackMethod = "exceptionBack")
    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }

  public List<UserAddress> exceptionBack(String userId) {
        return Arrays.asList(new UserAddress(10,"test","test","testt","test","Y"));
    }

}
