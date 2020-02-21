package com.neta.api.core.composite;

import java.util.List;

public class ProductAggregate {

	private final int productId;
	private final String name;
	private final String description;
	private final double price;
	private final List<ReviewSummary> reviews;
	private final ServiceAddresses serviceAddresses;

	public ProductAggregate() {

		this.productId = 0;
		this.name = null;
		this.description = null;
		this.price = 0;
		this.reviews = null;
		this.serviceAddresses = null;
	}

	public ProductAggregate(int productId, String name, String description, int price, List<ReviewSummary> reviews,
			ServiceAddresses serviceAddresses) {

		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
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
