package com.librarystore.book_rent_app.repository;

import com.librarystore.book_rent_app.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
//JpaRepository<EntityClass,Id_type>

}