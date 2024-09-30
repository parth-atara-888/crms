package com.effiya.crms.dao;

import com.effiya.crms.entitities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer, Long>{
    List<Customer> findByTeamFlag(String TeamFlag);
}

