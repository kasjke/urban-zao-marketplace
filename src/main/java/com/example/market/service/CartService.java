package com.example.market.service;

import com.example.market.dto.CartItemDto;

import java.util.List;

public interface CartService {
    void addToCart(Long productId, int quantity);
    void removeFromCart(Long productId);
    void updateCartItemQuantity(Long productId, int quantity);
    void clearCart();
    List<CartItemDto> getCartItems();
}
