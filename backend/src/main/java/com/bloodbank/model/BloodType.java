package com.bloodbank.model;

import javax.annotation.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity(name="blood_group")


public class BloodType {

	public BloodType() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="b_id")
	private int bloodId;
	
	@Column(name="b_type")
	private String bloodType;

	public BloodType(int bloodId, String bloodType) {
		super();
		this.bloodId = bloodId;
		this.bloodType = bloodType;
	}

	public BloodType(String bloodType) {
		super();
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "BloodType [bloodId=" + bloodId + ", bloodType=" + bloodType + "]";
	}

	public int getBloodId() {
		return bloodId;
	}

	public void setBloodId(int bloodId) {
		this.bloodId = bloodId;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	
	
}
