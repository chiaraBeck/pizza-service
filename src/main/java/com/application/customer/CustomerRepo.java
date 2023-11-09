package com.application.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<com.application.customer.Customer, Long> {
    @Query(value="select * from customer c where c.customer_id = :customerId", nativeQuery = true)
    com.application.customer.Customer getCustomerById(int customerId);

}
