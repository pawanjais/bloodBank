package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.State;


public interface StateRespository extends JpaRepository<State, Integer>{

}
