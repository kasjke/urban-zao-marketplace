package com.example.market.exception;

import com.example.market.api.ValidationConstants;


public class ProductNotFound extends RuntimeException{
    public ProductNotFound() {
        super(ValidationConstants.PRODUCT_NOT_FOUND);
    }
}
