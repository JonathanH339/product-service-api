package com.neta.api.core.composite;

public class ReviewSummary {

	private final int reviewId;
	private final String author;
	private final String title;
	private final String content;
	private final int rating;

	public ReviewSummary() {

		this.reviewId = 0;
		this.author = null;
		this.title = null;
		this.content = null;
		this.rating = 0;
	}

	public ReviewSummary(int reviewId, String author, String title, String content, int rating) {

		this.reviewId = reviewId;
		this.author = author;
		this.title = title;
		this.content = content;
		this.rating = rating;
	}

	public int getReviewId() {

		return reviewId;
	}

	public int getRating() {

		return rating;
	}

	public String getAuthor() {

		return author;
	}

	public String getTitle() {

		return title;
	}

	public String getContent() {

		return content;
	}

}
