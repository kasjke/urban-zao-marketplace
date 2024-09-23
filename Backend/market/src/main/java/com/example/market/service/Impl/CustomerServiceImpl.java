package com.example.market.service.Impl;

import com.example.market.dto.CustomerDto;
import com.example.market.entity.Cart;
import com.example.market.entity.Customer;
import com.example.market.exception.CustomerNotFound;
import com.example.market.mapper.CustomerMapper;
import com.example.market.repository.CustomerRepository;
import com.example.market.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDto registerCustomer(CustomerDto customerDto) {
        Customer customer = customerMapper.customerDtoToEntity(customerDto);
        Cart cart = new Cart();
        cart.setCustomer(customer);
        customer.setCart(cart);
        customer = customerRepository.save(customer);

        return customerMapper.customerEntityToDto(customer);
    }

    @Override
    public CustomerDto getCustomerById(long id) {
        Customer customer = customerRepository.findById(id).orElseThrow(CustomerNotFound::new);
        return customerMapper.customerEntityToDto(customer);
    }

    @Override
    public void updateCustomer(long id, CustomerDto customerDto) {
       Customer customer = customerRepository.findById(id).orElseThrow(CustomerNotFound::new);
            customerMapper.customerDtoToEntity(customerDto, customer);
            customerRepository.save(customer);

    }
}
