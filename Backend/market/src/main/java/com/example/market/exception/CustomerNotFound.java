package com.example.market.exception;

import com.example.market.api.ValidationConstants;

public class CustomerNotFound extends RuntimeException{
    public CustomerNotFound() {
        super(ValidationConstants.CUSTOMER_NOT_FOUND);
    }
}
