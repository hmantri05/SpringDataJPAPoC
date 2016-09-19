package com.himanshumantri.springdatajpspoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.himanshumantri.springdatajpapoc.response.Error;

@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Error handleException(Exception e) {
        Error error = new Error();
        error.setCode(HttpStatus.BAD_REQUEST.toString());
        error.setMessage(e.getMessage());
        return error;
    }
}
