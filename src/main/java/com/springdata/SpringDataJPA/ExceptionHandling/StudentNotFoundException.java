package com.springdata.SpringDataJPA.ExceptionHandling;

public class StudentNotFoundException extends Exception{

    public StudentNotFoundException(String message) {
        super(message);
    }
}
