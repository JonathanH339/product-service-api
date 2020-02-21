package com.neta.api.core.product;

public class Product {

	private int productId;
	private String name;
	private String description;
	private double price;
	private String serviceAddress;

	public Product() {

		this.productId = 0;
		this.name = null;
		this.description = null;
		this.price = 0;
		this.serviceAddress = null;
	}

	public Product(int productId, String name, String description, double price, String serviceAddress) {

		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.serviceAddress = serviceAddress;
	}

	public int getProductId() {

		return productId;
	}

	public void setProductId(int productId) {

		this.productId = productId;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public String getServiceAddress() {

		return serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {

		this.serviceAddress = serviceAddress;
	}

}
