package com.springCrud.springAngular.DTO;

import java.util.ArrayList;

public class CustomerUpdateDTO {
	
	private int customerid;
	private String customername;
	private String customeradd;
	private int mobile;
	private ArrayList<String> no;

	public CustomerUpdateDTO(int customerid, String customername, String customeradd, int mobile) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customeradd = customeradd;
		this.mobile = mobile;
	}

	public CustomerUpdateDTO() {
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
		return "CustomerUpdateDTO [customerid=" + customerid + ", customername=" + customername + ", customeradd="
				+ customeradd + ", mobile=" + mobile + ", no=" + no + "]";
	}
	
	
}
