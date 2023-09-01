package com.example.payroll;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(Long id){
        super("Could not found the Order with the id: "+id);
    }
}
