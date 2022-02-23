package com.bridgelabz.addressBookApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressBookApplication.model.AddressBookModel;



public interface AddressBookRepoInterface extends JpaRepository<AddressBookModel ,Integer>{

}
