package com.customers.Customers.repository;

import com.customers.Customers.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer>{
}
