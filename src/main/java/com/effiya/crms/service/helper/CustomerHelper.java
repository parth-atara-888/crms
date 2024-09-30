package com.effiya.crms.service.helper;

import com.effiya.crms.dto.CustomerDTO;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CustomerHelper {

    // Convert List of CustomerMaster entities to List of CustomerDTO
    public List<CustomerDTO> convertEntitiesToDTOs(List<CustomerDTO> customers) {
        List<CustomerDTO> customerDTOList = new ArrayList<>();

        for (CustomerDTO customer : customers) {
            CustomerDTO dto = new CustomerDTO();
            dto.setCustId(customer.getCustId());
            dto.setAccNo(customer.getAccNo());
            dto.setCustName(customer.getCustName());
            dto.setAssignedRiskTeam(customer.getAssignedRiskTeam());
            dto.setAssignedBusinessTeam(customer.getAssignedBusinessTeam());
            dto.setScoring(customer.getScoring());
            customerDTOList.add(dto);
        }

        return customerDTOList;
    }
}