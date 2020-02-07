

package com.neta.api.core.review;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReviewServiceAPI {

	@PostMapping(value = "/review", consumes = "application/json", produces = "application/json")
	public Review createReview(@RequestBody Review review);

	@GetMapping(value = "/review", produces = "application/json")
	public List<Review> getReviews(@RequestParam(value = "productId", required = true) int productId);

	@DeleteMapping(value = "/review")
	void deleteReviews(@RequestParam(value = "productId", required = true) int productId);
}
