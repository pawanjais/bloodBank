package com.bloodbank.model;

import java.util.List;

public class RevList {

	public RevList() {
		// TODO Auto-generated constructor stub
	}
	
	private List<Donor> don;
	private List<BloodBank> bb;
	@Override
	public String toString() {
		return "RevList [don=" + don + ", bb=" + bb + "]";
	}
	public RevList(List<Donor> don, List<BloodBank> bb) {
		super();
		this.don = don;
		this.bb = bb;
	}
	public List<Donor> getDon() {
		return don;
	}
	public void setDon(List<Donor> don) {
		this.don = don;
	}
	public List<BloodBank> getBb() {
		return bb;
	}
	public void setBb(List<BloodBank> bb) {
		this.bb = bb;
	}
	
	
	
	

}
