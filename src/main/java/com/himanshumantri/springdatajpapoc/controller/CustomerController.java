package com.himanshumantri.springdatajpapoc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.himanshumantri.springdatajpapoc.repository.model.Customer;
import com.himanshumantri.springdatajpapoc.request.AddCustomerRequest;
import com.himanshumantri.springdatajpapoc.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerSvc;

    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    public List<Customer> searchCustomersByFirstName(@RequestParam String firstName) throws Exception {
        return customerSvc.searchCustomersByFirstName(firstName);
    }
    
    @RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ResponseStatus(code=HttpStatus.OK)
    public void addCustomer(@Valid @RequestBody AddCustomerRequest request) throws Exception {
        customerSvc.addCustomer(request);
    }
}
