
package com.orders.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orders.entity.Orders;
@Repository
public interface OrdersDao extends JpaRepository<Orders, Integer>{

}