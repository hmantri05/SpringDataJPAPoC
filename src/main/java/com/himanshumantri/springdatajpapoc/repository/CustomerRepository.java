package com.himanshumantri.springdatajpapoc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.himanshumantri.springdatajpapoc.repository.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public List<Customer> findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}
