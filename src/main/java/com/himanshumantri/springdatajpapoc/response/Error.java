package com.himanshumantri.springdatajpapoc.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class Error implements Serializable {

    private static final long serialVersionUID = -6612735233257987330L;

    private String code;
    private String message;

}
