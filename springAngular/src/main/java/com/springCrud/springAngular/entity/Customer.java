package com.springCrud.springAngular.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "customer_id" , length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	
	@Column(name = "customer_name" , length=50)
	private String customername;
	
	@Column(name = "customer_add" , length=60)
	private String customeradd;
	
	@Column(name = "mobile" , length=50)
	private int mobile;
	
	private ArrayList<String> no;
	
	
	public Customer() {
		
	}


	public Customer(int customerid, String customername, String customeradd, int mobile, ArrayList<String> no) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeradd = customeradd;
		this.mobile = mobile;
		this.no = no;
	}

	public Customer(String customername, String customeradd, int mobile, ArrayList<String> no) {
		super();
		this.customername = customername;
		this.customeradd = customeradd;
		this.mobile = mobile;
		this.no = no;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public String getCustomeradd() {
		return customeradd;
	}


	public void setCustomeradd(String customeradd) {
		this.customeradd = customeradd;
	}


	public int getMobile() {
		return mobile;
	}


	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	
	public ArrayList<String> getNo() {
		return no;
	}


	public void setNo(ArrayList<String> no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", customeradd=" + customeradd
				+ ", mobile=" + mobile + ", no=" + no + "]";
	}	
}
