package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Gender;


public interface GenderRespository extends JpaRepository<Gender, Integer>{

}
