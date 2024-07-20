package com.springdata.SpringDataJPA.Services;

import com.springdata.SpringDataJPA.Pojos.Student;

import java.util.List;

public interface StudentService  {
    public List<Student> findAll();
    public Student findById(int id);
    public Student save(Student student);
    public void deleteById(int id);


}
