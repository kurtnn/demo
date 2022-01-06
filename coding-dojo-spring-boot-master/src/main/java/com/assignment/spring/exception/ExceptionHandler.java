package com.assignment.spring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.Date;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(CustomException.class)
    public ResponseEntity<?> customExceptionHandler(CustomException e) {
        return new ResponseEntity<>(new ExceptionDetail(new Date(), e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<?> generalExceptionHandler(Exception e) {
        return new ResponseEntity<>(new ExceptionDetail(new Date(), e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
