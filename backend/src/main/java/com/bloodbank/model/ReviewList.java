package com.bloodbank.model;

import java.util.List;

public class ReviewList {

	public ReviewList() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Review> review;
	private List<AcceptReview> accreview;
	@Override
	public String toString() {
		return "ReviewList [review=" + review + ", accreview=" + accreview + "]";
	}
	public ReviewList(List<Review> review, List<AcceptReview> accreview) {
		super();
		this.review = review;
		this.accreview = accreview;
	}
	public List<Review> getReview() {
		return review;
	}
	public void setReview(List<Review> review) {
		this.review = review;
	}
	public List<AcceptReview> getAccreview() {
		return accreview;
	}
	public void setAccreview(List<AcceptReview> accreview) {
		this.accreview = accreview;
	}
	
	
	
	

}
