package com.example.market.entity;

import com.example.market.enums.Available;
import com.example.market.enums.Discount;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    private String product_name;
    private String description ;
    private Double rating;
    private BigDecimal price;
    private String image;
    private int stock_quantity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "collection_id")
    private Collection collection;
    @ManyToOne
    @JoinColumn(name = "shop_id", nullable = false)
    private Shop shop;
    @CreationTimestamp
    private LocalDate time_added;
    @Enumerated(EnumType.STRING)
    private Discount discount;
    @Enumerated(EnumType.STRING)
    private Available available;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems;
}
