package com.librarystore.book_rent_app.services;

import com.librarystore.book_rent_app.entity.Order;
import com.librarystore.book_rent_app.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderServiceAction implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceAction(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Integer id) {
        Optional<Order> result = orderRepository.findById(id);
        Order data = null;
        if(result.isPresent()){
            data = result.get();
        }else{
            throw new RuntimeException("Not found id: "+id);
        }
        return data;
    }

    @Override
    public void deleteById(Integer id) {
        Optional<Order> result = orderRepository.findById(id);
        Order data = null;
        if(result.isPresent()){
            orderRepository.deleteById(id);
        }else{
            throw new RuntimeException("Not found id: "+id);
        }

    }
}
