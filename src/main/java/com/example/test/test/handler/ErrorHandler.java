package com.example.test.test.handler;

import com.example.test.test.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {
    @ExceptionHandler (value = NotFoundException.class)
    public ResponseEntity<Object> handlerNotFoundException(NotFoundException ex){
        return new ResponseEntity<>("An error occured: " +ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
