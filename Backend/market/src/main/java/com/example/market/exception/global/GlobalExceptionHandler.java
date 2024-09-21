package com.example.market.exception.global;

import com.example.market.exception.CustomerNotFound;
import com.example.market.exception.OrderNotFound;
import com.example.market.utils.ErrorObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerNotFound.class)
    public ResponseEntity<ErrorObject> handleCustomerNotFoundException(CustomerNotFound ex) {
        return getErrorObjectResponseEntity(ex, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OrderNotFound.class)
    public ResponseEntity<ErrorObject> handleOrderNotFoundException(OrderNotFound ex) {
        return getErrorObjectResponseEntity(ex, HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<ErrorObject> getErrorObjectResponseEntity(Exception ex, HttpStatus status) {
        log.error("Exception occurred: {}", ex.getMessage());
        ErrorObject errorObject = new ErrorObject();
        errorObject.setStatusCode(status.value());
        errorObject.setMessage(ex.getMessage());
        errorObject.setTimestamp(LocalDateTime.now().toString());
        return new ResponseEntity<>(errorObject, status);
    }

}
