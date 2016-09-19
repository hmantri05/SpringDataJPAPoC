package com.himanshumantri.springdatajpapoc.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.himanshumantri.springdatajpapoc.util.Constants;

import lombok.Data;

@Data
public class AddCustomerRequest {

    @Size(min=2)
    @NotNull
    private String firstName;
    
    @Size(min=2)
    @NotNull
    private String lastName;
    
    @Size(min=2)
    private String city;
    
    @Email(message=Constants.INVALID_INPUT)
    @NotNull(message=Constants.CANNOT_BE_NULL)
    private String emailId;
}
