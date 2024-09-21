package com.example.market.controller;

import com.example.market.dto.CustomerDto;
import com.example.market.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.market.api.PathConstants.*;

@RestController
@RequestMapping(API_V1_CUSTOMERS)
@RequiredArgsConstructor
@Tag(name = "Customer", description = "Customer API")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    @PostMapping(CREATE_CUSTOMER)
    @Operation(summary = "Register a new customer", description = "Creates a new customer account")
    @ApiResponse(responseCode = "201", description = "Customer successfully created")
    public ResponseEntity<CustomerDto> registerCustomer(@RequestBody CustomerDto customerDto) {
        logger.info("Registering new customer: {}", customerDto.getEmail());
        CustomerDto createdCustomer = customerService.registerCustomer(customerDto);
        logger.info("Customer registered successfully: {}", createdCustomer.getId());
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
    }

    @GetMapping(GET_CUSTOMER_BY_ID)
    @Operation(summary = "Get a customer by ID", description = "Retrieves a customer's details by their ID")
    @ApiResponse(responseCode = "200", description = "Customer details retrieved successfully")
    @ApiResponse(responseCode = "404", description = "Customer not found")
    public ResponseEntity<CustomerDto> getCustomerById(
            @Parameter(description = "ID of the customer to retrieve")
            @PathVariable("id") long id) {
        logger.info("Fetching customer with id: {}", id);
        CustomerDto customer = customerService.getCustomerById(id);
        logger.info("Customer fetched successfully: {}", id);
        return ResponseEntity.ok(customer);
    }

    @PutMapping(UPDATE_CUSTOMER_BY_ID)
    @Operation(summary = "Update a customer", description = "Updates an existing customer's details")
    @ApiResponse(responseCode = "204", description = "Customer updated successfully")
    @ApiResponse(responseCode = "404", description = "Customer not found")
    public ResponseEntity<Void> updateCustomer(
            @Parameter(description = "ID of the customer to update")
            @PathVariable("id") long id,
            @RequestBody CustomerDto customerDto) {
        logger.info("Updating customer with id: {}", id);
        customerService.updateCustomer(id, customerDto);
        logger.info("Customer updated successfully: {}", id);
        return ResponseEntity.noContent().build();
    }
}
