package com.bridgelabz.addressBookApplication.service;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressBookApplication.model.AddressBookModel;

@Service
public class AddressBookService {
	
	// hello message to user
	public String message() {
		
		return "hello user to address method ";
	}
	// welcome message to the user name 
	public String messageByName(String name) {
		return "Hello ! "+name+"  welcome to address book application";
	}
	public AddressBookModel save(AddressBookModel addressBookobj) {
		AddressBookModel addressbookmodel= new AddressBookModel(addressBookobj);
		return addressbookmodel;
	}


}
