package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity(name="gender")
public class Gender {

	public Gender() {
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="g_id")
	private int genderId;
	
	@Column(name="g_type")
	private String genderType;

	public Gender(int genderId, String genderType) {
		super();
		this.genderId = genderId;
		this.genderType = genderType;
	}

	@Override
	public String toString() {
		return "Gender [genderId=" + genderId + ", genderType=" + genderType + "]";
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderType() {
		return genderType;
	}

	public void setGenderType(String genderType) {
		this.genderType = genderType;
	}
	
	
}
