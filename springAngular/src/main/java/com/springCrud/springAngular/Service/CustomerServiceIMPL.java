package com.springCrud.springAngular.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springCrud.springAngular.CustomerRepo.CustomerRepo;
import com.springCrud.springAngular.DTO.CustomerDTO;
import com.springCrud.springAngular.DTO.CustomerSaveDTO;
import com.springCrud.springAngular.DTO.CustomerUpdateDTO;
import com.springCrud.springAngular.entity.Customer;

@Service
public class CustomerServiceIMPL implements CustomerService{

	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		
		Customer customer = new Customer(
				
					customerSaveDTO.getCustomername(),
					customerSaveDTO.getCustomeradd(),
					customerSaveDTO.getMobile(),
					customerSaveDTO.getNo()
		);
//		System.out.println(customerSaveDTO.getNo());
		customerRepo.save(customer);
		return customer.getCustomername();
				
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> getCustomers = customerRepo.findAll();
		List<CustomerDTO> customerDTOList = new ArrayList<>();
		for(Customer a:getCustomers){
			CustomerDTO customerDTO = new CustomerDTO(
					
					a.getCustomerid(),
					a.getCustomername(),
					a.getCustomeradd(),
					a.getMobile(),
					a.getNo()
			);
			customerDTOList.add(customerDTO);	
		}
		return customerDTOList;
	}
	



	@Override
	public String UpdateCustomers(CustomerUpdateDTO customerUpdateDTO) {
		if(customerRepo.existsById(customerUpdateDTO.getCustomerid())) {
			@SuppressWarnings("deprecation")
			Customer customer = customerRepo.getById(customerUpdateDTO.getCustomerid());
			
			
			customer.setCustomername(customerUpdateDTO.getCustomername());
			customer.setCustomeradd(customerUpdateDTO.getCustomeradd());
			customer.setMobile(customerUpdateDTO.getMobile());
			customer.setNo(customerUpdateDTO.getNo());
			customerRepo.save(customer);
		}
		else {
			System.out.println("Customer ID do not Exist");
		}
		return null;
	}
	
	@Override
    public boolean deleteCustomer(int id) {
 
        if(customerRepo.existsById(id))
        {
            customerRepo.deleteById(id);
        }
        else
        {
            System.out.println("customer id not found");
        }
 
        return true;
    }


}
