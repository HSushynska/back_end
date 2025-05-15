package de.ait.userapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "t_product")

public class Product {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "product_title")
    private String title;
    private BigDecimal price;
}
