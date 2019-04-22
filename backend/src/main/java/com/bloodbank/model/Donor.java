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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="donor")

@NamedQueries({
	@NamedQuery(name = "Donor.fetchGroupData", query = "from Donor d join d.bloodType b join d.address a where b.bloodId= ? and a.addressCity= ?"),
	@NamedQuery(name = "Donor.fetchcount", query = "select count(d.bloodType)  from Donor d right join  d.bloodType b group by b.bloodId having count(b.bloodId)>=0"),
	@NamedQuery(name = "Donor.fetchactivedonor", query = "from Donor d where d.donorActive=? and d.donorBlocked=?"),
	@NamedQuery(name = "Donor.fetchinactivedonor", query = "from Donor d where d.donorActive=?"),
	@NamedQuery(name = "Donor.fetchblockeddonor", query = "from Donor d where d.donorBlocked=?"),
	@NamedQuery(name = "Donor.userLogin", query = "from Donor d where d.donorName=? and d.donorPassword=?"),
	@NamedQuery(name = "Donor.usersearch", query = "select d from Donor d where d.donorId=?")
})


@Entity
public class Donor {

	public Donor() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="d_id")
	private int donorId;
	
	@Column(name="d_name")
	private String donorName;
	
	@Column(name="d_password")
	private String donorPassword;
	
	@Column(name="d_phoneno")
	private String donorPhone;
	
	@Column(name="d_email")
	private String donorEmail;
	
	@Column(name="d_identity")
	private String donorIdentity;
	
	@Column(name="d_age")
	private String donorAge;
	
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_b_id")
	private BloodType bloodType;
	
	@ManyToOne(fetch=FetchType.EAGER,cascade = {CascadeType.ALL})
	@JoinColumn(name="fk_a_id")
	private Address address;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_g_id")
	private Gender gender;
	
	
	@Column(name="d_active")
	private String donorActive;
	
	@Column(name="d_blocked")
	private String donorBlocked;

	public Donor(int donorId, String donorName, String donorPassword, String donorPhone, String donorEmail,
			String donorIdentity, String donorAge, BloodType bloodType, Address address, Gender gender,
			String donorActive, String donorBlocked) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorPassword = donorPassword;
		this.donorPhone = donorPhone;
		this.donorEmail = donorEmail;
		this.donorIdentity = donorIdentity;
		this.donorAge = donorAge;
		this.bloodType = bloodType;
		this.address = address;
		this.gender = gender;
		this.donorActive = donorActive;
		this.donorBlocked = donorBlocked;
	}

	public Donor(String donorName, String donorPassword, String donorPhone, String donorEmail, String donorIdentity,
			String donorAge, BloodType bloodType, Address address, Gender gender, String donorActive,
			String donorBlocked) {
		super();
		this.donorName = donorName;
		this.donorPassword = donorPassword;
		this.donorPhone = donorPhone;
		this.donorEmail = donorEmail;
		this.donorIdentity = donorIdentity;
		this.donorAge = donorAge;
		this.bloodType = bloodType;
		this.address = address;
		this.gender = gender;
		this.donorActive = donorActive;
		this.donorBlocked = donorBlocked;
	}

	@Override
	public String toString() {
		return "Donor [donorId=" + donorId + ", donorName=" + donorName + ", donorPassword=" + donorPassword
				+ ", donorPhone=" + donorPhone + ", donorEmail=" + donorEmail + ", donorIdentity=" + donorIdentity
				+ ", donorAge=" + donorAge + ", bloodType=" + bloodType + ", address=" + address + ", gender=" + gender
				+ ", donorActive=" + donorActive + ", donorBlocked=" + donorBlocked + "]";
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getDonorPassword() {
		return donorPassword;
	}

	public void setDonorPassword(String donorPassword) {
		this.donorPassword = donorPassword;
	}

	public String getDonorPhone() {
		return donorPhone;
	}

	public void setDonorPhone(String donorPhone) {
		this.donorPhone = donorPhone;
	}

	public String getDonorEmail() {
		return donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public String getDonorIdentity() {
		return donorIdentity;
	}

	public void setDonorIdentity(String donorIdentity) {
		this.donorIdentity = donorIdentity;
	}

	public String getDonorAge() {
		return donorAge;
	}

	public void setDonorAge(String donorAge) {
		this.donorAge = donorAge;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDonorActive() {
		return donorActive;
	}

	public void setDonorActive(String donorActive) {
		this.donorActive = donorActive;
	}

	public String getDonorBlocked() {
		return donorBlocked;
	}

	public void setDonorBlocked(String donorBlocked) {
		this.donorBlocked = donorBlocked;
	}
	
	
	
	

}
