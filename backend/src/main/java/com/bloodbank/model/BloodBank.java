package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.web.ResourceProperties.Strategy;
import org.springframework.stereotype.Component;

@Component
@Table(name="blood_bank")


@NamedQueries({
	@NamedQuery(name = "BloodBank.fetchdata", query = "from BloodBank d where d.bBankCity=?")

})


@Entity
public class BloodBank {

	public BloodBank() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="bb_id")
	private int bBankId;
	
	@Column(name="bb_name")
	private String bBankName;
	
	@Column(name="bb_address")
	private String bbankAddress;
	
	@Column(name="bb_phoneno")
	private String bBankPhone;
	
	@Column(name="bb_city")
	private String bBankCity;
	
	public BloodBank(int bBankId, String bBankName, String bbankAddress, String bBankPhone, String bBankCity) {
		super();
		this.bBankId = bBankId;
		this.bBankName = bBankName;
		this.bbankAddress = bbankAddress;
		this.bBankPhone = bBankPhone;
		this.bBankCity = bBankCity;
	}
	
	public BloodBank(String bBankName, String bbankAddress, String bBankPhone, String bBankCity) {
		super();
		this.bBankName = bBankName;
		this.bbankAddress = bbankAddress;
		this.bBankPhone = bBankPhone;
		this.bBankCity = bBankCity;
	}

	@Override
	public String toString() {
		return "BloodBank [bBankId=" + bBankId + ", bBankName=" + bBankName + ", bbankAddress=" + bbankAddress
				+ ", bBankPhone=" + bBankPhone + ", bBankCity=" + bBankCity + "]";
	}

	public int getbBankId() {
		return bBankId;
	}

	public void setbBankId(int bBankId) {
		this.bBankId = bBankId;
	}

	public String getbBankName() {
		return bBankName;
	}

	public void setbBankName(String bBankName) {
		this.bBankName = bBankName;
	}

	public String getBbankAddress() {
		return bbankAddress;
	}

	public void setBbankAddress(String bbankAddress) {
		this.bbankAddress = bbankAddress;
	}

	public String getbBankPhone() {
		return bBankPhone;
	}

	public void setbBankPhone(String bBankPhone) {
		this.bBankPhone = bBankPhone;
	}

	public String getbBankCity() {
		return bBankCity;
	}

	public void setbBankCity(String bBankCity) {
		this.bBankCity = bBankCity;
	}
	
	
	
	
	
	

}
