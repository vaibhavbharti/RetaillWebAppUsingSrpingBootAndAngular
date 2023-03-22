package com.ayushi.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayushi.test.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long>{

}
