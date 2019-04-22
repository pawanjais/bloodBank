package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bloodbank.model.BloodType;


@Repository
public interface BloodTypeRespository extends JpaRepository<BloodType, Integer>{

}
