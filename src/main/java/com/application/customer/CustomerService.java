package com.application.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired private com.application.customer.CustomerRepo customerRepo;
    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    public com.application.customer.Customer getCustomerById(int customerId){
        return customerRepo.getCustomerById(customerId);
    }
}
