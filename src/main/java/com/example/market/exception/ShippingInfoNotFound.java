package com.example.market.exception;

import com.example.market.api.ValidationConstants;

public class ShippingInfoNotFound extends RuntimeException{
    public ShippingInfoNotFound() {
        super(ValidationConstants.SHIPPING_INFO_NOT_FOUND);
    }
}
