package com.bloodbank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.BloodBank;
import com.bloodbank.model.Donor;

public interface BloodBankRespository extends JpaRepository<BloodBank, Integer>{
	public List<BloodBank> fetchdata(String ac);
}
