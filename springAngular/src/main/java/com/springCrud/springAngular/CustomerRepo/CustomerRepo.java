package com.springCrud.springAngular.CustomerRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.springCrud.springAngular.entity.Customer;

@EnableJpaRepositories
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	
	
}
