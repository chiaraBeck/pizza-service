package com.application.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    public String firstName;
    private String lastName;
    @Id private Integer customerId;

    //TODO address
}
