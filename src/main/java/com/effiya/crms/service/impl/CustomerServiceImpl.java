package com.effiya.crms.service.impl;

import com.effiya.crms.dao.CustomerDao;
import com.effiya.crms.dao.CustomerMasterRepository;
import com.effiya.crms.dto.AccountRequestDTO;
import com.effiya.crms.dto.CustomerDTO;
import com.effiya.crms.service.CustomerService;
import com.effiya.crms.service.helper.CustomerHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMasterRepository CustomerMasterRepository;
    @Autowired
    private CustomerHelper customerHelper;
    @Override
    public List<CustomerDTO> getCustomersByUserTypeAndId(AccountRequestDTO requestDTO) {
        List<CustomerDTO> customers = new ArrayList<CustomerDTO>();

        if ("risk".equalsIgnoreCase(requestDTO.getUserType())) {
            customers.addAll(CustomerMasterRepository.findByAssignedRiskTeamUser(requestDTO.getUserId()));
        } else if ("business".equalsIgnoreCase(requestDTO.getUserType())) {
            customers.addAll(CustomerMasterRepository.findByAssignedBusinessTeamUser(requestDTO.getUserId()));
        }
        return customerHelper.convertEntitiesToDTOs(customers);
    }}