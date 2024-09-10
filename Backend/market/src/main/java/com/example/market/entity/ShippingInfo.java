package com.example.market.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
