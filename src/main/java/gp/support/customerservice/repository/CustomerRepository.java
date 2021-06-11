package gp.support.customerservice.repository;

import gp.support.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer getCustomerByName(String customer);

}
