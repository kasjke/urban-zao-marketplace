package com.example.market.service;

import com.example.market.dto.CustomerDto;

public interface CustomerService {

   CustomerDto registerCustomer(CustomerDto customerDto);
   CustomerDto getCustomerById(long id);
   void updateCustomer(long id, CustomerDto customerDto);
}
