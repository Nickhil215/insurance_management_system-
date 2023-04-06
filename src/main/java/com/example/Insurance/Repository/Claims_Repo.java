package com.example.Insurance.Repository;

import com.example.Insurance.Models.Claims;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Claims_Repo extends JpaRepository<Claims,Integer> {
}
