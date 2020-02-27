package com.neta.api.core.product;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import reactor.core.publisher.Mono;

public interface ProductServiceAPI {

	@PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
	Product createProduct(@RequestBody Product product);

	@GetMapping(value = "/product/{productId}", produces = "application/json")
	Mono<Product> getProduct(@PathVariable int productId);

	@DeleteMapping(value = "/product/{productId}")
	void deleteProduct(@PathVariable int productId);

}
