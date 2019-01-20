package service;

import model.Address;

public class EasyPrintService implements PrintDetailService{
	
	String name;
	int id;
	Address address;
	
	public EasyPrintService(String name, Address address, int i) {
		super();
		this.name = name;
		this.address = address;
		this.id = i;
	}

	public void printDetails() {
		String fullAddress = address.getStreetname() + ", " + address.getCity();
		System.out.println("EasyPrintService [name=" + name + ", id=" + id + ", address=" + fullAddress  + "]");
		
		
	}

	

	
	

}
