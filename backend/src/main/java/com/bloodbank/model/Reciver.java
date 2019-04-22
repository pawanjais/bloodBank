package com.bloodbank.model;

import javax.persistence.CascadeType;
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

@Entity(name="reciver")
public class Reciver {

	public Reciver() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="r_id")
	private int reciverId;
	
	@Column(name="r_name")
	private String reciverName;
	
	@Column(name="r_identity")
	private String reciverIdentity;
	
	@Column(name="r_phoneno")
	private String reciverPhone;
	
	@Column(name="r_email")
	private String reciverEmail;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_b_id")
	private BloodType bloodType;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade = {CascadeType.ALL})
	@JoinColumn(name="fk_a_id")
	private Address address;

	public Reciver(int reciverId, String reciverName, String reciverIdentity, String reciverPhone, String reciverEmail,
			BloodType bloodType, Address address) {
		super();
		this.reciverId = reciverId;
		this.reciverName = reciverName;
		this.reciverIdentity = reciverIdentity;
		this.reciverPhone = reciverPhone;
		this.reciverEmail = reciverEmail;
		this.bloodType = bloodType;
		this.address = address;
	}

	public Reciver(String reciverName, String reciverIdentity, String reciverPhone, String reciverEmail,
			BloodType bloodType, Address address) {
		super();
		this.reciverName = reciverName;
		this.reciverIdentity = reciverIdentity;
		this.reciverPhone = reciverPhone;
		this.reciverEmail = reciverEmail;
		this.bloodType = bloodType;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Reciver [reciverId=" + reciverId + ", reciverName=" + reciverName + ", reciverIdentity="
				+ reciverIdentity + ", reciverPhone=" + reciverPhone + ", reciverEmail=" + reciverEmail + ", bloodType="
				+ bloodType + ", address=" + address + "]";
	}

	public int getReciverId() {
		return reciverId;
	}

	public void setReciverId(int reciverId) {
		this.reciverId = reciverId;
	}

	public String getReciverName() {
		return reciverName;
	}

	public void setReciverName(String reciverName) {
		this.reciverName = reciverName;
	}

	public String getReciverIdentity() {
		return reciverIdentity;
	}

	public void setReciverIdentity(String reciverIdentity) {
		this.reciverIdentity = reciverIdentity;
	}

	public String getReciverPhone() {
		return reciverPhone;
	}

	public void setReciverPhone(String reciverPhone) {
		this.reciverPhone = reciverPhone;
	}

	public String getReciverEmail() {
		return reciverEmail;
	}

	public void setReciverEmail(String reciverEmail) {
		this.reciverEmail = reciverEmail;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

	
}
