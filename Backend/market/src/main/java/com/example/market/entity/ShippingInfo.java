package com.example.market.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "shipping_info")
public class ShippingInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_info_id")
    private long id;

    private LocalDateTime shippingAddress;
    private LocalDateTime shippingDate;
    private LocalDateTime deliveryDate;
    private LocalDateTime shippingMethod;

    @OneToMany(mappedBy = "shippingInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order> orders;
}
