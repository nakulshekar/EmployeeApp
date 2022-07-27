package com.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class NotFoundExcept {
	@ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity handleBlogAlreadyExistsException(ResourceNotFoundException ResourceNotFoundException) {
        return new ResponseEntity("Employee does not exist in the database!", HttpStatus.CONFLICT);
    }
}
