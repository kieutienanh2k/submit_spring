package com.example.exam.repository;

import com.example.exam.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
    List<EmployeeEntity> findAllByName(String name);

    @Query("select e from EmployeeEntity e where e.name like %:name%")
    List<EmployeeEntity> findNameCustom(String name);
}
