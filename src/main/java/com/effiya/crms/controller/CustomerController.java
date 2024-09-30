package com.effiya.crms.controller;

import com.effiya.crms.dto.AccountRequestDTO;
import com.effiya.crms.dto.CustomerDTO;
import com.effiya.crms.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.List;
@RestController
@RequestMapping("/accounts")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/data")
    public List<CustomerDTO> getCustomersByUserType(@RequestBody @Valid AccountRequestDTO requestDTO) {
        return customerService.getCustomersByUserTypeAndId(requestDTO);
    }
}