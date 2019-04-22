package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Component
@Entity(name="donation")
public class Donation {

	public Donation() {
		// TODO Auto-generated constructor stub
	}
	

	@Id
	@Column(name="do_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donationId;
	
	@Column(name="do_name")
	private String donationName;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_d_id")
	private Donor donor;

	public Donation(int donationId, String donationName, Donor donor) {
		super();
		this.donationId = donationId;
		this.donationName = donationName;
		this.donor = donor;
	}

	public Donation(String donationName, Donor donor) {
		super();
		this.donationName = donationName;
		this.donor = donor;
	}

	@Override
	public String toString() {
		return "Donation [donationId=" + donationId + ", donationName=" + donationName + ", donor=" + donor + "]";
	}

	public int getDonationId() {
		return donationId;
	}

	public void setDonationId(int donationId) {
		this.donationId = donationId;
	}

	public String getDonationName() {
		return donationName;
	}

	public void setDonationName(String donationName) {
		this.donationName = donationName;
	}

	public Donor getDonor() {
		return donor;
	}

	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	
	

}
