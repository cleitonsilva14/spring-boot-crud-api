package io.api.minha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.api.minha.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByName(String name);
}
