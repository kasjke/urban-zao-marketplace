package com.example.market.controller;

import com.example.market.dto.CartItemDto;
import com.example.market.service.CartService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.market.api.PathConstants.*;

@RestController
@RequestMapping(API_V1_CARTS)
@RequiredArgsConstructor
@Tag(name = "Cart Controller", description = "Operations for managing the shopping cart")
public class CartController {

    private static final Logger logger = LoggerFactory.getLogger(CartController.class);

    private final CartService cartService;

    @Operation(summary = "Add product to cart",
            description = "Adds the specified quantity of a product to the shopping cart.")
    @ApiResponse(responseCode = "200", description = "Product successfully added to cart")
    @PostMapping(ADD_PRODUCT_TO_CART)
    public ResponseEntity<Void> addToCart(
            @Parameter(description = "ID of the product to add to the cart", required = true)
            @PathVariable Long productId,
            @Parameter(description = "Quantity of the product to add", required = true)
            @RequestParam int quantity) {

        logger.info("Adding product with ID {} and quantity {} to cart", productId, quantity);
        cartService.addToCart(productId, quantity);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Remove product from cart",
            description = "Removes a product from the shopping cart by its ID.")
    @ApiResponse(responseCode = "200", description = "Product successfully removed from cart")
    @DeleteMapping(REMOVE_PRODUCT_FROM_CART)
    public ResponseEntity<Void> removeFromCart(
            @Parameter(description = "ID of the product to remove from the cart", required = true)
            @PathVariable Long productId) {

        logger.info("Removing product with ID {} from cart", productId);
        cartService.removeFromCart(productId);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Get cart items",
            description = "Retrieves all items in the shopping cart.")
    @ApiResponse(responseCode = "200", description = "Cart items retrieved successfully")
    @GetMapping(GET_CART_ITEMS)
    public ResponseEntity<List<CartItemDto>> getCartItems() {
        logger.info("Fetching cart items");
        return ResponseEntity.ok(cartService.getCartItems());
    }

    @Operation(summary = "Update product quantity in cart",
            description = "Updates the quantity of a product in the shopping cart.")
    @ApiResponse(responseCode = "200", description = "Product quantity successfully updated")
    @PutMapping(UPDATE_PRODUCT_IN_CART)
    public ResponseEntity<Void> updateCartItemQuantity(
            @Parameter(description = "ID of the product to update", required = true)
            @PathVariable Long productId,
            @Parameter(description = "New quantity for the product", required = true)
            @RequestParam int quantity) {

        logger.info("Updating product with ID {} to quantity {}", productId, quantity);
        cartService.updateCartItemQuantity(productId, quantity);
        return ResponseEntity.ok().build();
    }

    @Operation(summary = "Clear cart",
            description = "Removes all items from the shopping cart.")
    @ApiResponse(responseCode = "200", description = "Cart successfully cleared")
    @PostMapping(CLEAR_CART)
    public ResponseEntity<Void> clearCart() {
        logger.info("Clearing the cart");
        cartService.clearCart();
        return ResponseEntity.ok().build();
    }
}
