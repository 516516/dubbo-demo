package com.personal.knowledge.dubbo.service;

import java.util.List;

import com.personal.knowledge.dubbo.bean.UserAddress;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	public List<UserAddress> initOrder(String userId);

}
