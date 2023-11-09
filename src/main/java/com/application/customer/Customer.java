package com.application.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Customer {
    private String firstName;
    private String lastName;
    @Id private Integer customerId;

    //TODO address
}
