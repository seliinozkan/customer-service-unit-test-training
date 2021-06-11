package gp.support.customerservice;

import gp.support.customerservice.model.Customer;
import gp.support.customerservice.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.BDDAssertions.then;


@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void testGetCustomerByName_returnCustomerDetails() {

        //given
        Customer savedCustomer = customerRepository.save( new Customer(null, "Jack"));

        //when
         Customer customer = customerRepository.getCustomerByName("Jack");

        //then
        then(customer.getId()).isNotNull();
        then(customer.getName()).isEqualTo(savedCustomer.getName());

    }

}
