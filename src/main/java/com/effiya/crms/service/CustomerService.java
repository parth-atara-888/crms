package com.effiya.crms.service;

import com.effiya.crms.dto.AccountRequestDTO;
import com.effiya.crms.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {


    List<CustomerDTO> getCustomersByUserTypeAndId(AccountRequestDTO requestDTO);
}
