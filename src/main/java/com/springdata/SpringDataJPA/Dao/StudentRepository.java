package com.springdata.SpringDataJPA.Dao;

import com.springdata.SpringDataJPA.Pojos.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {
}
