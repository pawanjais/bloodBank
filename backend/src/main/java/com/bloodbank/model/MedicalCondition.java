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
@Entity(name="medical_condition")
public class MedicalCondition {

	public MedicalCondition() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="mc_id")
	private int medicalConditionId;
	
	@Column(name="mc_type")
	private String medicalConditionType;
	
	@Column(name="mc_accept")
	private String medicalConditionAccept;

	public MedicalCondition(int medicalConditionId, String medicalConditionType, String medicalConditionAccept) {
		super();
		this.medicalConditionId = medicalConditionId;
		this.medicalConditionType = medicalConditionType;
		this.medicalConditionAccept = medicalConditionAccept;
	}

	public MedicalCondition(String medicalConditionType, String medicalConditionAccept) {
		super();
		this.medicalConditionType = medicalConditionType;
		this.medicalConditionAccept = medicalConditionAccept;
	}

	@Override
	public String toString() {
		return "MedicalCondition [medicalConditionId=" + medicalConditionId + ", medicalConditionType="
				+ medicalConditionType + ", medicalConditionAccept=" + medicalConditionAccept + "]";
	}

	public int getMedicalConditionId() {
		return medicalConditionId;
	}

	public void setMedicalConditionId(int medicalConditionId) {
		this.medicalConditionId = medicalConditionId;
	}

	public String getMedicalConditionType() {
		return medicalConditionType;
	}

	public void setMedicalConditionType(String medicalConditionType) {
		this.medicalConditionType = medicalConditionType;
	}

	public String getMedicalConditionAccept() {
		return medicalConditionAccept;
	}

	public void setMedicalConditionAccept(String medicalConditionAccept) {
		this.medicalConditionAccept = medicalConditionAccept;
	}
	
	
	

}
