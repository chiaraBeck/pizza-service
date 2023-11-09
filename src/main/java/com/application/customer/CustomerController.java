package com.application.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CustomerController {

    @Autowired private CustomerService customerService;
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/customer/{customerId}")
    public String getCustomerById(@PathVariable int customerId) {
        var customer = customerService.getCustomerById(customerId);
        if (customer != null) {
            return customer.getFirstName() + " " + customer.getLastName();
        } else {
            return "Customer not found";
        }
    }
}