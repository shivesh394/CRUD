package com.springCrud.springAngular.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springCrud.springAngular.DTO.CustomerDTO;
import com.springCrud.springAngular.DTO.CustomerSaveDTO;
import com.springCrud.springAngular.DTO.CustomerUpdateDTO;
import com.springCrud.springAngular.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(path = "/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO) {
		String id = customerService.addCustomer(customerSaveDTO);
		return id;
	}
	
	@GetMapping(path = "/getAllCustomer")
	public List<CustomerDTO> getAllCustomer(){
		List<CustomerDTO>allCustomers = customerService.getAllCustomer();
		return allCustomers;
	}
	
	
	@PutMapping(path = "/update")
	public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO) {
		String id = customerService.UpdateCustomers(customerUpdateDTO);
		return id;
	}
	
	@DeleteMapping(path = "/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable(value ="id") int id) {
		@SuppressWarnings("unused")
		Boolean deletecustomer = customerService.deleteCustomer(id);
		return "deleted";
				
	}


}
