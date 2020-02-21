
package com.neta.api.core.composite;

public class ReviewSummary {

	private final int reviewId;
	private final int rating;
	private final String author;
	private final String title;
	private final String content;

	public ReviewSummary() {

		this.reviewId = 0;
		this.rating = 0;
		this.author = null;
		this.title = null;
		this.content = null;
	}

	public ReviewSummary(int reviewId, int rating, String author, String title, String content) {

		this.reviewId = reviewId;
		this.rating = rating;
		this.author = author;
		this.title = title;
		this.content = content;
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
