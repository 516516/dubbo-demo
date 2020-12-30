package com.personal.knowledge.dubbo.bootdemouserconsumer.controller;

import com.personal.knowledge.dubbo.bean.UserAddress;
import com.personal.knowledge.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: dubbo-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-12-29 15:42
 **/
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
        return orderService.initOrder(userId);
    }


}
