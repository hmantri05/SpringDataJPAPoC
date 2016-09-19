package com.himanshumantri.springdatajpapoc.repository.model;

import lombok.Data;

import org.springframework.data.annotation.Id;

@Data
public class Customer {

    @Id
    private String emailId;
    private String firstName;
    private String lastName;
    private String city;

    public Customer(String firstName, String lastName, String city, String emailId) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.emailId = emailId;
    }

}
