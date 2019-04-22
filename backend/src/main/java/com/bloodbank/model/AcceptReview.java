package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component

@Entity(name="accept_review")
public class AcceptReview {

	public AcceptReview() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ar_id")
	private int aReviewId;
	
	@Column(name="ar_name")
	private String aReviewName;
	
	@Column(name="ar_quote")
	private String aReviewQuote;

	public AcceptReview(int aReviewId, String aReviewName, String aReviewQuote) {
		super();
		this.aReviewId = aReviewId;
		this.aReviewName = aReviewName;
		this.aReviewQuote = aReviewQuote;
	}

	public AcceptReview(String aReviewName, String aReviewQuote) {
		super();
		this.aReviewName = aReviewName;
		this.aReviewQuote = aReviewQuote;
	}

	@Override
	public String toString() {
		return "AcceptReview [aReviewId=" + aReviewId + ", aReviewName=" + aReviewName + ", aReviewQuote="
				+ aReviewQuote + "]";
	}

	public int getaReviewId() {
		return aReviewId;
	}

	public void setaReviewId(int aReviewId) {
		this.aReviewId = aReviewId;
	}

	public String getaReviewName() {
		return aReviewName;
	}

	public void setaReviewName(String aReviewName) {
		this.aReviewName = aReviewName;
	}

	public String getaReviewQuote() {
		return aReviewQuote;
	}

	public void setaReviewQuote(String aReviewQuote) {
		this.aReviewQuote = aReviewQuote;
	}
	
	
	

}
