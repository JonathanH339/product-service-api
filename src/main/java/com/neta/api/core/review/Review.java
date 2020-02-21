package com.neta.api.core.review;

public class Review {

	private int productId;
	private int reviewId;
	private int rating;
	private String author;
	private String title;
	private String content;
	private String serviceAddress;

	public Review() {

		this.reviewId = 0;
		this.productId = 0;
		this.rating = 0;
		this.author = null;
		this.title = null;
		this.content = null;
		this.serviceAddress = null;
	}

	public Review(int productId, int reviewId, int rating, String author, String title, String content,
			String serviceAddress) {

		this.productId = productId;
		this.reviewId = reviewId;
		this.rating = rating;
		this.author = author;
		this.title = title;
		this.content = content;
		this.serviceAddress = serviceAddress;
	}

	public int getReviewId() {

		return reviewId;
	}

	public void setReviewId(int reviewId) {

		this.reviewId = reviewId;
	}

	public int getProductId() {

		return productId;
	}

	public void setProductId(int productId) {

		this.productId = productId;
	}

	public int getRating() {

		return rating;
	}

	public String getAuthor() {

		return author;
	}

	public void setAuthor(String author) {

		this.author = author;
	}

	public void setRating(int rating) {

		this.rating = rating;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getContent() {

		return content;
	}

	public void setContent(String content) {

		this.content = content;
	}

	public String getServiceAddress() {

		return serviceAddress;
	}

	public void setServiceAddress(String serviceAddress) {

		this.serviceAddress = serviceAddress;
	}

}
