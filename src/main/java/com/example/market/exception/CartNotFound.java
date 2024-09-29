package com.example.market.exception;

import com.example.market.api.ValidationConstants;

public class CartNotFound extends RuntimeException {
    public CartNotFound() {
        super(ValidationConstants.CART_NOT_FOUND);
    }
}
