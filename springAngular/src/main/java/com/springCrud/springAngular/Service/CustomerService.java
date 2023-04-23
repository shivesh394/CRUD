package com.springCrud.springAngular.Service;

import java.util.List;

import com.springCrud.springAngular.DTO.CustomerDTO;
import com.springCrud.springAngular.DTO.CustomerSaveDTO;
import com.springCrud.springAngular.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String UpdateCustomers(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
