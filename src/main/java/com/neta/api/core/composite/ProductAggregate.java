package com.neta.api.core.composite;

import java.util.List;

public class ProductAggregate {

	private final int productId;
	private final String name;
	private final String description;
	private final List<ReviewSummary> reviews;
	private final double price;
	private final ServiceAddresses serviceAddresses;

	public ProductAggregate() {

		this.productId = 0;
		this.name = null;
		this.description = null;
		this.reviews = null;
		this.price = 0;
		this.serviceAddresses = null;
	}

	public ProductAggregate(int productId, double price, String name, String description, List<ReviewSummary> reviews,
			ServiceAddresses serviceAddresses) {

		this.productId = productId;
		this.price = price;
		this.name = name;
		this.description = description;
		this.reviews = reviews;
		this.serviceAddresses = serviceAddresses;
	}

	public int getProductId() {

		return productId;
	}

	public String getName() {

		return name;
	}

	public String getDescription() {

		return description;
	}

	public List<ReviewSummary> getReviews() {

		return reviews;
	}

	public double getPrice() {

		return price;
	}

	public ServiceAddresses getServiceAddresses() {

		return serviceAddresses;
	}

}
