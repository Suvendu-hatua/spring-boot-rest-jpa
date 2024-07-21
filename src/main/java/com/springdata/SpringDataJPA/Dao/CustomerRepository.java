package com.springdata.SpringDataJPA.Dao;

import com.springdata.SpringDataJPA.Rest.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //No coding is required!---->Spring-data-rest will automatically create all the basic
    //Crud related operations end points.
}
