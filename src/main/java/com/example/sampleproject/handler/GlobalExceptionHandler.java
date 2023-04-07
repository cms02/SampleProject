package com.example.sampleproject.handler;

import com.example.sampleproject.dto.response.CommonResDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException e) {
            Map<String, String> errorMap = new HashMap<>();
            for (FieldError fe : e.getFieldErrors()) {
                errorMap.put(fe.getField(), fe.getDefaultMessage());
            }
        return new ResponseEntity<>(CommonResDto.builder().msg(errorMap.toString()).build(), HttpStatus.BAD_REQUEST);
    }
}
