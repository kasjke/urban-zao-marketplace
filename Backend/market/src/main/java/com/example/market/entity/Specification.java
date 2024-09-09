package com.example.market.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "specification")
@Getter
@Setter
public class Specification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private SpecificationType type;

    @Column(name = "value", nullable = false)
    private String value;

    @OneToMany(mappedBy = "specification")
    private List<SpecificationProduct> specificationProducts;
}
