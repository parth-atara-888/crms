package com.effiya.crms.dao;

import com.effiya.crms.dto.CustomerDTO;
import com.effiya.crms.entitities.Customer;
import com.effiya.crms.entitities.CustomerMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerMasterRepository extends JpaRepository<CustomerMaster, String>
{

    List<CustomerDTO> findByAssignedRiskTeamUser(String userId);
    List<CustomerDTO> findByAssignedBusinessTeamUser(String userId);
    }

