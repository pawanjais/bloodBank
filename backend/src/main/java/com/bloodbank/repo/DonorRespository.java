package com.bloodbank.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Admin;
import com.bloodbank.model.Donor;
import com.bloodbank.model.Reciver;


public interface DonorRespository extends JpaRepository<Donor, Integer>{
    public List<Donor> fetchGroupData(int bloodty,String addcity);
    public List<Long> fetchcount();
    public List<Donor> fetchactivedonor(String ac,String bloc);
    public List<Donor> fetchinactivedonor(String ac);
    public List<Donor> fetchblockeddonor(String ac);
    public Donor usersearch(int id);
    public Donor userLogin(String name,String pass);
}
