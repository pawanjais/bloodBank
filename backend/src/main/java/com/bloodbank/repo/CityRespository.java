package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.City;


public interface CityRespository extends JpaRepository<City, Integer>{

}
