package com.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ExistExcept {
	@ExceptionHandler(value = ResourceExistsException.class)
    public ResponseEntity handleBlogAlreadyExistsException(ResourceExistsException ResourceExistsException) {
        return new ResponseEntity("Employee already exists in the database!", HttpStatus.CONFLICT);
    }
}
