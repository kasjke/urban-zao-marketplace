package com.example.market.entity;

import com.example.market.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String password;
    @NonNull
    private String email;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'USER'")
    private Role role;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;
}
