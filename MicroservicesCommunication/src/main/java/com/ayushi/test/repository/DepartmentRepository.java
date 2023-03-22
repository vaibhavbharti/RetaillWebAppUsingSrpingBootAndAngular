package com.ayushi.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.test.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}