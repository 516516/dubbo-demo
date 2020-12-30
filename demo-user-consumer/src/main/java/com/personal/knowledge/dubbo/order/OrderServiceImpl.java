package com.personal.knowledge.dubbo.order;

import com.personal.knowledge.dubbo.bean.UserAddress;
import com.personal.knowledge.dubbo.service.OrderService;
import com.personal.knowledge.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: dubbo-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-12-29 14:04
 **/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }

}
