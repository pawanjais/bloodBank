package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Address;


public interface AddressRespository extends JpaRepository<Address, Integer>{

}
