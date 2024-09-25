package com.example.market.exception;

import com.example.market.api.ValidationConstants;

public class OrderNotFound extends RuntimeException {
    public OrderNotFound() {
        super(ValidationConstants.ORDER_NOT_FOUND);
    }
}
