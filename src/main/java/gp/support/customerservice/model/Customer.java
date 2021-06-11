package gp.support.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
