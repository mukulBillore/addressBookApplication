package com.bridgelabz.addressBookAppInSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.addressBookAppInSpring.model.AddressBookModel;


public interface AddressBookRepoInterface extends JpaRepository<AddressBookModel ,Integer>{

}
