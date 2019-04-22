package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.DonorCondition;


public interface DonorConditionRespository extends JpaRepository<DonorCondition, Integer>{

}
