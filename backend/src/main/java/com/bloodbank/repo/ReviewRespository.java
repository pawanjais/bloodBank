package com.bloodbank.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bloodbank.model.Review;

public interface ReviewRespository extends JpaRepository<Review, Integer>{

}
