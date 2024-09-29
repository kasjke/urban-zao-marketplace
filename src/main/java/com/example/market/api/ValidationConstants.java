package com.example.market.api;

public final class ValidationConstants {
    public static final String PRODUCT_NOT_FOUND = "Product not found";
    public static final String CART_NOT_FOUND ="Cart not found" ;
    public static final String CUSTOMER_NOT_FOUND = "Customer not found";
    public static final String ORDER_NOT_FOUND = "Order not found";
    public static final String CATEGORY_NOT_FOUND = "Category not found";
    public static final String INSTANTIATION_ERROR_MESSAGE = "%s shouldn't be instantiated";
    public static final String SHIPPING_INFO_NOT_FOUND = "Shipping info not found";

    private ValidationConstants() {
        throw new AssertionError(String.format(INSTANTIATION_ERROR_MESSAGE, ValidationConstants.class.getSimpleName()));
    }
}