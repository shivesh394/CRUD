package com.springCrud.springAngular.DTO;

import java.util.ArrayList;


public class CustomerSaveDTO {

	private String customername;
	private String customeradd;
	private int mobile;
	private ArrayList<String> no;

	public CustomerSaveDTO(String customername, String customeradd, int mobile, ArrayList<String> no) {
		super();
		this.customername = customername;
		this.customeradd = customeradd;
		this.mobile = mobile;
		this.no = no;
	}


	public CustomerSaveDTO() {
		
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
		return "CustomerSaveDTO [customername=" + customername + ", customeradd=" + customeradd + ", mobile=" + mobile
				+ ", no=" + no + "]";
	}

	
}
