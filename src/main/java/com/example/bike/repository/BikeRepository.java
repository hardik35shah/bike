package com.example.bike.repository;

import com.example.bike.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BikeRepository extends JpaRepository<Bike,Long> {
}
