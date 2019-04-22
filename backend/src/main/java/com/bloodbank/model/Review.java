package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component

@Entity(name="review")
public class Review {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="r_id")
	private int reviewId;
	
	@Column(name="r_name")
	private String reviewName;
	
	@Column(name="r_quote")
	private String reviewQuote;
	
	

	public Review() {
		super();
	}

	public Review(int reviewId, String reviewName, String reviewQuote) {
		super();
		this.reviewId = reviewId;
		this.reviewName = reviewName;
		this.reviewQuote = reviewQuote;
	}

	public Review(String reviewName, String reviewQuote) {
		super();
		this.reviewName = reviewName;
		this.reviewQuote = reviewQuote;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", reviewName=" + reviewName + ", reviewQuote=" + reviewQuote + "]";
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getReviewQuote() {
		return reviewQuote;
	}

	public void setReviewQuote(String reviewQuote) {
		this.reviewQuote = reviewQuote;
	}
	
	
	
}
