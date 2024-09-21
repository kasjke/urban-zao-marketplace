package com.example.market.api;

public final class ValidationConstants {
    private ValidationConstants() {
        throw new AssertionError(String.format(INSTANTIATION_ERROR_MESSAGE, ValidationConstants.class.getSimpleName()));
    }

    public static final String CUSTOMER_NOT_FOUND = "Customer not found";
    public static final String ORDER_NOT_FOUND = "Order not found";
    public static final String INSTANTIATION_ERROR_MESSAGE = "%s shouldn't be instantiated";
}