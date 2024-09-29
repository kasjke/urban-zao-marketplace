package com.example.market.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.market.api.PathConstants.API_V1_PRODUCTS;

@RestController
@RequestMapping(API_V1_PRODUCTS)
@RequiredArgsConstructor
public class ProductController {

}
