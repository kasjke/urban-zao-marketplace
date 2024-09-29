package com.example.market.api;

public final class PathConstants {
    private PathConstants() {
        throw new AssertionError(String.format(ValidationConstants.INSTANTIATION_ERROR_MESSAGE, PathConstants.class.getSimpleName()));
    }

    public static final String API_V1 = "/api/v1";
    public static final String API_V1_CUSTOMERS = API_V1 + "/customers";
    public static final String CREATE_CUSTOMER = "/create";
    public static final String GET_CUSTOMER_BY_ID = "/getById/{id}";
    public static final String UPDATE_CUSTOMER_BY_ID = "/update/{id}";


    public static final String API_V1_ORDERS = API_V1 + "/orders";
    public static final String GET_ORDER_BY_ID =  "/getById/{id}";
    public static final String CREATE_ORDER =  "/create";
    public static final String API_V1_PRODUCTS = API_V1 + "/products";

    public static final String API_V1_CARTS = API_V1 + "/carts";
    public static final String ADD_PRODUCT_TO_CART = API_V1_CARTS + "/add/{productId}";
    public static final String REMOVE_PRODUCT_FROM_CART = API_V1_CARTS + "/remove/{productId}";
    public static final String GET_CART_ITEMS = API_V1_CARTS + "/getCartItems";
    public static final String UPDATE_PRODUCT_IN_CART = API_V1_CARTS + "/update/{productId}";
    public static final String CLEAR_CART = API_V1_CARTS + "/clear";


    public static final String API_V1_CATEGORIES = API_V1 + "/categories";
}
