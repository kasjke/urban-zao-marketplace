package com.example.market.controller;

import com.example.market.dto.OrderDto;
import com.example.market.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.example.market.api.PathConstants.*;

@RestController
@AllArgsConstructor
@RequestMapping(API_V1_ORDERS)
@Tag(name = "Order", description = "Order API")
public class OrderController {

    private final OrderService orderService;

    @PostMapping(CREATE_ORDER)
    @Operation(summary = "Create a new order", description = "Creates a new order with the provided details")
    @ApiResponse(responseCode = "201", description = "Order successfully created")
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
        OrderDto createdOrder = orderService.createOrder(orderDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    @GetMapping(GET_ORDER_BY_ID)
    @Operation(summary = "Get an order by ID", description = "Retrieves order details by the order ID")
    @ApiResponse(responseCode = "200", description = "Order details retrieved successfully")
    @ApiResponse(responseCode = "404", description = "Order not found")
    public ResponseEntity<OrderDto> getOrderById(
            @Parameter(description = "ID of the order to retrieve") @PathVariable long id) {
        OrderDto order = orderService.getOrderById(id);
        return ResponseEntity.ok(order);
    }
}
