package com.orient.azercell.repository;

import com.orient.azercell.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Customer,Long> {

}
