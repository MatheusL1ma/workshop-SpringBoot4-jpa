package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entidades.Order;
import com.educandoweb.course.entidades.User;

//OPCIONAL O REPOSITORY, POIS O JPA JA POSSUI
public interface OrderRepository extends JpaRepository<Order, Long>{

}
