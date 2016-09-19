package com.himanshumantri.springdatajpapoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshumantri.springdatajpapoc.repository.CustomerRepository;
import com.himanshumantri.springdatajpapoc.repository.model.Customer;
import com.himanshumantri.springdatajpapoc.request.AddCustomerRequest;


@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepo;

    public List<Customer> searchCustomersByFirstName(String firstName) throws Exception {
        List<Customer> listOfCustomers = customerRepo.findByFirstName(firstName);
        return listOfCustomers;
    }

    public void addCustomer(AddCustomerRequest request) throws Exception {
        customerRepo.insert(new Customer(request.getFirstName(), request.getLastName(), request.getCity(), request.getEmailId()));
    }
}
