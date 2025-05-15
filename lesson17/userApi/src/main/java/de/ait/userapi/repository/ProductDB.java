package de.ait.userapi.repository;

import de.ait.userapi.model.Product;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class ProductDB {
    //private Long lastId = 6L;
    private static HashMap<Long, Product> map = new HashMap<>();
    static {
        map.put(1L, new Product(1L, "apple", new BigDecimal("2.22")));
        map.put(2L, new Product(2L, "juice", new BigDecimal("3.5")));
        map.put(3L, new Product(3L, "cheese", new BigDecimal("5.2")));
        map.put(4L, new Product(4L, "tea", new BigDecimal("2.3")));
        map.put(5L, new Product(5L, "sugar", new BigDecimal("5.3")));
        map.put(6L, new Product(6L, "beer", new BigDecimal("0.95")));

    }

    public List<Product> findAll() {
        return map.values().stream().toList();
    }

    public Product findById(Long id){
        return map.get(id);
    }
}
