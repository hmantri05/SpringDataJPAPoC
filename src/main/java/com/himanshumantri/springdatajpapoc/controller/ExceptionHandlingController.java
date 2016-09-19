package com.himanshumantri.springdatajpapoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.himanshumantri.springdatajpapoc.response.ErrorResponse;


@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorResponse handleException(Exception e) {
        ErrorResponse error = new ErrorResponse();
        error.setCode(HttpStatus.BAD_REQUEST.toString());
        error.setMessage(e.getMessage());
        return error;
    }
}
