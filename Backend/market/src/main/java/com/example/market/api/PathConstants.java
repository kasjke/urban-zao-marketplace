package com.example.market.api;

public final class PathConstants {
    private PathConstants() {
        throw new AssertionError(String.format(ValidationConstants.INSTANTIATION_ERROR_MESSAGE, PathConstants.class.getSimpleName()));
    }

    public static final String API_V1 = "/api/v1";
    public static final String API_V1_CUSTOMERS = API_V1 + "/customers";
    public static final String CREATE_CUSTOMER =API_V1_CUSTOMERS + "/create";
    public static final String GET_CUSTOMER_BY_ID =API_V1_CUSTOMERS + "/getById/{id}";
    public static final String UPDATE_CUSTOMER_BY_ID =API_V1_CUSTOMERS + "/update/{id}";


    public static final String API_V1_ORDERS = API_V1 + "/orders";
    public static final String GET_ORDER_BY_ID = API_V1_ORDERS + "/getById/{id}";
    public static final String CREATE_ORDER = API_V1_ORDERS + "/create";
    public static final String API_V1_PRODUCTS = API_V1 + "/products";

    public static final String API_V1_CATEGORIES = API_V1 + "/categories";

    public static final String API_V1_COLLECTIONS = API_V1 + "/collections";
}
