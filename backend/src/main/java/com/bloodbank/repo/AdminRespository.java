package com.bloodbank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Admin;
import com.bloodbank.model.Donor;


public interface AdminRespository extends JpaRepository<Admin, Integer>{
	public Admin adminLogin(String uname,String upass);
	public Admin adminsearch(String name);
}
