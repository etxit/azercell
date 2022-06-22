package com.orient.azercell.controller;

import com.orient.azercell.entity.Customer;
import com.orient.azercell.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    ServiceRepository serviceRepository;

    @GetMapping("/service/customers")
    public List<Customer> getCustomer()
    {
        return serviceRepository.findAll();
    }

}
