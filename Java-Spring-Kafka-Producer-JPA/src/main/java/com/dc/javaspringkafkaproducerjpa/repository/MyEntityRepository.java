package com.dc.javaspringkafkaproducerjpa.repository;

import com.dc.javaspringkafkaproducerjpa.entity.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
}
