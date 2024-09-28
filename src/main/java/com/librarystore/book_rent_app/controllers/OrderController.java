package com.librarystore.book_rent_app.controllers;

import com.librarystore.book_rent_app.entity.Order;
import com.librarystore.book_rent_app.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello, World!";
    }

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order){
//        id = 0 mean create new data
        order.setId(0);
        return orderService.save(order);
    }

    @GetMapping("/orders")
    public List<Order> getAllOrder(){
        return orderService.findAll();
    }

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable int id){
        return orderService.findById(id);
    }

    @DeleteMapping("/orders/{id}")
    public String deleteOrder(@PathVariable int id) {
        orderService.deleteById(id);
        return "Delete Successfully";
    }
    @PutMapping("/orders")
    public Order updateOrder(@RequestBody Order order){
//        If id is not 0 that mean update exist data
        return orderService.save(order);
    }
}
