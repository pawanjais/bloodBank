package com.bloodbank.model;

import java.util.List;

public class DonorList {

	public DonorList() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Donor> active;
	private List<Donor> unactive;
	private List<Donor> blocked;
	@Override
	public String toString() {
		return "DonorList [active=" + active + ", unactive=" + unactive + ", blocked=" + blocked + "]";
	}
	public DonorList(List<Donor> active, List<Donor> unactive, List<Donor> blocked) {
		super();
		this.active = active;
		this.unactive = unactive;
		this.blocked = blocked;
	}
	public List<Donor> getActive() {
		return active;
	}
	public void setActive(List<Donor> active) {
		this.active = active;
	}
	public List<Donor> getUnactive() {
		return unactive;
	}
	public void setUnactive(List<Donor> unactive) {
		this.unactive = unactive;
	}
	public List<Donor> getBlocked() {
		return blocked;
	}
	public void setBlocked(List<Donor> blocked) {
		this.blocked = blocked;
	}
	
	
	

}
