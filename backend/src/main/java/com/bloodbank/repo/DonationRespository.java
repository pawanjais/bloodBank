package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Donation;


public interface DonationRespository extends JpaRepository<Donation, Integer>{

}
