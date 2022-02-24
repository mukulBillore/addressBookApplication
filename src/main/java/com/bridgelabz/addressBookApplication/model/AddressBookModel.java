package com.bridgelabz.addressBookApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.addressBookApplication.dto.AddressBookDTO;


@Entity
@Table(name="addressBookDetails")
public class AddressBookModel {
	@Id
	@GeneratedValue
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	private String city;
	private String state;
	private Integer zip;
	
	
	//default constructor is added 
	public AddressBookModel() {}
	
	
	// constructor with Class model object and id 
	public AddressBookModel(AddressBookModel objAddressBook, Integer id1) {
		this.id = id1;
		this.firstName = objAddressBook.getFirstName();
		this.lastName = objAddressBook.getLastName();
		this.email = objAddressBook.getEmail();
		this.phoneNumber = objAddressBook.getPhoneNumber();
		this.city = objAddressBook.getCity();
		this.state = objAddressBook.getState();
		this.zip = objAddressBook.getZip();

	}
	
		

    // model fields costructor by model refrance object parameter
	public AddressBookModel(AddressBookModel objAddressBook) {
		this.id = objAddressBook.getId();
		this.firstName = objAddressBook.getFirstName();
		this.lastName = objAddressBook.getLastName();
		this.email = objAddressBook.getEmail();
		this.phoneNumber = objAddressBook.getPhoneNumber();
		this.city = objAddressBook.getCity();
		this.state = objAddressBook.getState();
		this.zip = objAddressBook.getZip();
	
	}
	

	
	// constructor : parameter as DTO object and id 
	public AddressBookModel(AddressBookDTO objAddressBook, int id) {
	
		this.id = id;
		this.firstName = objAddressBook.getFirstName();
		this.lastName = objAddressBook.getLastName();
		this.email = objAddressBook.getEmail();
		this.phoneNumber = objAddressBook.getPhoneNumber();
		this.city = objAddressBook.getCity();
		this.state = objAddressBook.getState();
		this.zip = objAddressBook.getZip();

	}


	


	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

}
