package com.orders.serviceimpl;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orders.service.OrdersService;

@Service
public abstract class OrdersServiceImpl implements OrdersService{
	
 @SuppressWarnings("unused")
@Autowired
 private OrderBy ordersDao;
 
 

}
