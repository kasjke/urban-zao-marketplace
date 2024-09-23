package com.example.market.exception;

import com.example.market.api.ValidationConstants;

public class CategoryNotFound extends RuntimeException{
    public CategoryNotFound() {
        super(ValidationConstants.CATEGORY_NOT_FOUND);
    }
}
