package com.bloodbank.model;

import java.util.List;

public class AdminList {

	public AdminList() {
		// TODO Auto-generated constructor stub
	}
	
	private Admin curradmin;
	private List<Admin> admin;
	private List<BloodBank> bloodBank;
	private Long donorCount;
	private Long eventCount;
	private Long reviewCount;
	private Long bloodtypeCount;
	@Override
	public String toString() {
		return "AdminList [curradmin=" + curradmin + ", admin=" + admin + ", bloodBank=" + bloodBank + ", donorCount="
				+ donorCount + ", eventCount=" + eventCount + ", reviewCount=" + reviewCount + ", bloodtypeCount="
				+ bloodtypeCount + "]";
	}
	public AdminList(Admin curradmin, List<Admin> admin, List<BloodBank> bloodBank, Long donorCount, Long eventCount,
			Long reviewCount, Long bloodtypeCount) {
		super();
		this.curradmin = curradmin;
		this.admin = admin;
		this.bloodBank = bloodBank;
		this.donorCount = donorCount;
		this.eventCount = eventCount;
		this.reviewCount = reviewCount;
		this.bloodtypeCount = bloodtypeCount;
	}
	public Admin getCurradmin() {
		return curradmin;
	}
	public void setCurradmin(Admin curradmin) {
		this.curradmin = curradmin;
	}
	public List<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(List<Admin> admin) {
		this.admin = admin;
	}
	public List<BloodBank> getBloodBank() {
		return bloodBank;
	}
	public void setBloodBank(List<BloodBank> bloodBank) {
		this.bloodBank = bloodBank;
	}
	public Long getDonorCount() {
		return donorCount;
	}
	public void setDonorCount(Long donorCount) {
		this.donorCount = donorCount;
	}
	public Long getEventCount() {
		return eventCount;
	}
	public void setEventCount(Long eventCount) {
		this.eventCount = eventCount;
	}
	public Long getReviewCount() {
		return reviewCount;
	}
	public void setReviewCount(Long reviewCount) {
		this.reviewCount = reviewCount;
	}
	public Long getBloodtypeCount() {
		return bloodtypeCount;
	}
	public void setBloodtypeCount(Long bloodtypeCount) {
		this.bloodtypeCount = bloodtypeCount;
	}
	
	
	

}
