package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bloodbank.model.Event;

public interface EventRespository extends JpaRepository<Event, Integer>{

}
