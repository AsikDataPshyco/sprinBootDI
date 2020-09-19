package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class ClientsClass {
	
	private int clientid;
	private String clientName;
	private String clientCity;
	private int phoneNumber;
	
	@Autowired
	private products prod;
	
	public products getProd() {
		return prod;
	}
	public void setProd(products prod) {
		this.prod = prod;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientCity() {
		return clientCity;
	}
	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void testmethod()
	{
		System.out.println("Clients Object Created Successfully");
		
		prod.prodtest();
	}
}
