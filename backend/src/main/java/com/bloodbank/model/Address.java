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
@Entity(name="address")
public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="a_id")
	private int addressId;
	
	@Column(name="a_locality")
	private String addressLocality;
	
	@Column(name="a_city")
	private String addressCity;
	
	@Column(name="a_state")
	private String addressState;

	public Address(int addressId, String addressLocality, String addressCity, String addressState) {
		super();
		this.addressId = addressId;
		this.addressLocality = addressLocality;
		this.addressCity = addressCity;
		this.addressState = addressState;
	}

	public Address(String addressLocality, String addressCity, String addressState) {
		super();
		this.addressLocality = addressLocality;
		this.addressCity = addressCity;
		this.addressState = addressState;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressLocality=" + addressLocality + ", addressCity="
				+ addressCity + ", addressState=" + addressState + "]";
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLocality() {
		return addressLocality;
	}

	public void setAddressLocality(String addressLocality) {
		this.addressLocality = addressLocality;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}
	
	
	

}
