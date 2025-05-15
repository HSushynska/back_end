package de.ait.userapi.service;

import de.ait.userapi.dto.ProductResponseDto;
import de.ait.userapi.model.Product;
import de.ait.userapi.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    @Override
    public List<ProductResponseDto> getAllProducts() {
        return repository.findAll()
                .stream()
                .map(ProductServiceImpl::toResponseDto)
                .toList();
    }

    @Override
    public ProductResponseDto getProductById(Long id) {
        Product product = repository.findById(id).get();
        if (product != null) {
            return toResponseDto(product);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    private static ProductResponseDto toResponseDto (Product product) {
        return new ProductResponseDto(product.getId(), product.getTitle(), product.getPrice());
    }
}

