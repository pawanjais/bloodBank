package com.bloodbank.model;

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

@Entity(name="m_condition")
public class DonorCondition {

	public DonorCondition() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private int c_Id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_d_id")
	private Donor donor;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_mc_id")
	private MedicalCondition medicalCondition;


	public DonorCondition(Donor donor, MedicalCondition medicalCondition) {
		super();
		this.donor = donor;
		this.medicalCondition = medicalCondition;
	}


	@Override
	public String toString() {
		return "DonorCondition [donor=" + donor + ", medicalCondition=" + medicalCondition + "]";
	}


	public Donor getDonor() {
		return donor;
	}


	public void setDonor(Donor donor) {
		this.donor = donor;
	}


	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}


	public void setMedicalCondition(MedicalCondition medicalCondition) {
		this.medicalCondition = medicalCondition;
	}


	public int getC_Id() {
		return c_Id;
	}


	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}
	
	
	
	
	
}
