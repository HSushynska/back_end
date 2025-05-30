package de.ait.userapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
// lombok
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor

//DB
@Entity  // таблица
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private BigDecimal price;
}
