package com.bloodbank.model;

import java.util.List;

public class CountList {

	public CountList() {
		// TODO Auto-generated constructor stub
	}
	
	private List<BloodType> blood;
	private List<Long> count;
	@Override
	public String toString() {
		return "CountList [blood=" + blood + ", count=" + count + "]";
	}
	public CountList(List<BloodType> blood, List<Long> count) {
		super();
		this.blood = blood;
		this.count = count;
	}
	public List<BloodType> getBlood() {
		return blood;
	}
	public void setBlood(List<BloodType> blood) {
		this.blood = blood;
	}
	public List<Long> getCount() {
		return count;
	}
	public void setCount(List<Long> count) {
		this.count = count;
	}
	
	
	
	
	

}
