package com.example.demo.repository;

import com.example.demo.model.BoyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoyRepository extends JpaRepository<BoyModel, Integer> {

}
