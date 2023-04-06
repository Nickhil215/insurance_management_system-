package com.example.Insurance.Repository;

import com.example.Insurance.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Client_Repo extends JpaRepository<Client,Integer> {
}
