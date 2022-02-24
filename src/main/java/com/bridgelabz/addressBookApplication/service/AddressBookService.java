package com.bridgelabz.addressBookApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressBookApplication.dto.AddressBookDTO;
import com.bridgelabz.addressBookApplication.model.AddressBookModel;
import com.bridgelabz.addressBookApplication.repository.AddressBookRepoInterface;

@Service
public class AddressBookService {
	@Autowired
	AddressBookRepoInterface repo;

	// hello message to user
	public String message() {

		return "hello user to address method ";
	}

	// welcome message to the user name
	public String messageByName(String name) {
		return "Hello ! " + name + "  welcome to address book application";
	}

	// save the data into repo
	public AddressBookModel save(AddressBookModel addressBookobj) {
		AddressBookModel addressbookmodel = new AddressBookModel(addressBookobj);
		repo.save(addressbookmodel);
		return addressbookmodel;
	}

	// delete by id
	public String deleteById(int id) {
		repo.deleteById(id);
		return "person is sucussfully deleted from  address book";
	}

	// find all from db
	public List<AddressBookModel> getAll() {
		List<AddressBookModel> addressBookList = repo.findAll();
		return addressBookList;
	}

	// get by id from db
	public AddressBookModel getByid(int id) {
			return repo.findById(id).get();
	}

	// update by id from db
	public AddressBookModel updateByid(AddressBookDTO dtoObj, int id) {
		AddressBookModel addressbookmodel = new AddressBookModel(dtoObj, id);
		repo.save(addressbookmodel);
		return addressbookmodel;
	}

}
