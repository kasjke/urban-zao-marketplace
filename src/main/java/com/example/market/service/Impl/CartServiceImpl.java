package com.example.market.service.Impl;

import com.example.market.dto.CartItemDto;
import com.example.market.entity.Cart;
import com.example.market.entity.CartItem;
import com.example.market.entity.Customer;
import com.example.market.entity.Product;
import com.example.market.exception.ProductNotFound;
import com.example.market.mapper.CartItemMapper;
import com.example.market.repository.CartRepository;
import com.example.market.repository.ProductRepository;
import com.example.market.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepository cartRepository;
    private final ProductRepository productRepository;
    private final CartItemMapper cartItemMapper;
    @Transactional
    @Override
    public void addToCart(Long productId, int quantity) {

        Customer customer = new Customer();       //ToDo  change to an authorized customer
        Cart cart = customer.getCart();
        Product product = productRepository.findById(productId).orElseThrow(ProductNotFound::new);

        Optional<CartItem> cartItemOptional = cart.getItems()
                .stream()
                .filter(item -> item.getProduct().getId() == productId)
                .findFirst();

        CartItem cartItem;
        if (cartItemOptional.isPresent()) {
            cartItem = cartItemOptional.get();
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        } else {
            cartItem = new CartItem();
            cartItem.setProduct(product);
            cartItem.setQuantity(quantity);
            cartItem.setCart(cart);
            cart.getItems().add(cartItem);
        }

        cartItem.setTotal_price(product.getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));
        cartRepository.save(cart);
    }

    @Transactional
    @Override
    public void removeFromCart( Long productId) {
        Customer customer = new Customer();       //ToDo  change to an authorized customer
        Cart cart = customer.getCart();
        cart.getItems().removeIf(item -> item.getProduct().getId() == (productId));
        cartRepository.save(cart);
    }

    @Override
    public List<CartItemDto> getCartItems() {
        Customer customer = new Customer();       //ToDo  change to an authorized customer
        Cart cart = customer.getCart();
        return cart.getItems().stream()
                .map(cartItemMapper::cartItemToCartItemDto)
                .toList();
    }

    @Transactional
    @Override
    public void updateCartItemQuantity(Long productId, int quantity) {
        Customer customer = new Customer();       //ToDo  change to an authorized customer
        Cart cart = customer.getCart();

        Optional<CartItem> cartItemOptional = cart.getItems()
                .stream()
                .filter(item -> item.getProduct().getId() == (productId))
                .findFirst();


        if (cartItemOptional.isPresent()) {
            CartItem cartItem = cartItemOptional.get();
            cartItem.setQuantity(quantity);
            BigDecimal totalPrice = cartItem.getProduct().getPrice().multiply(BigDecimal.valueOf(quantity));
            cartItem.setTotal_price(totalPrice);

            cartRepository.save(cart);
        }
    }

    @Transactional
    public void clearCart() {
        Customer customer = new Customer();       //ToDo  change to an authorized customer
        Cart cart = customer.getCart();
        cart.getItems().clear();
        cartRepository.save(cart);
    }
}
