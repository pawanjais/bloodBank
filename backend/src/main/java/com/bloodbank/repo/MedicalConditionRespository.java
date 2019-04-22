package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.MedicalCondition;


public interface MedicalConditionRespository extends JpaRepository<MedicalCondition, Integer>{

}
