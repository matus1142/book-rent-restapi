package com.librarystore.book_rent_app.services;

import com.librarystore.book_rent_app.entity.Order;

import java.util.List;

public interface OrderService {
    Order save(Order order);
    List<Order> findAll();
    Order findById(Integer id);
    void deleteById(Integer id);
}
