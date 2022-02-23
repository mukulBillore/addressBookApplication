package com.bridgelabz.addressBookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressBookApplication.model.AddressBookModel;
import com.bridgelabz.addressBookApplication.repository.AddressBookRepoInterface;


@RestController
public class AddressBookController {

	@Autowired
	AddressBookRepoInterface repo;

	// hello msg printing 
	@GetMapping("/hello")
	public String sayHello() {
		return "welocome to Address book ";
	}

	// hello msg with name
	@PostMapping("/helloBy	Name")
	public String mapbyName(@RequestParam String name) {
		return name + " ! welcome to Address book system";
	}

	// Saving the data in the local modal object. 
	@PostMapping("/saveData")
	public String setBook(@RequestBody AddressBookModel addressBookobj) {
		AddressBookModel addressBookObj = new AddressBookModel(addressBookobj);
		repo.save(addressBookObj);
		return "saved the person details  With name :" + addressBookObj.getFirstName() + " "
				+ addressBookObj.getLastName();
	}

	

	// find all by id
	@GetMapping("/findAll")
	public List<AddressBookModel> findAll() {
		List<AddressBookModel> addressBooklist = repo.findAll();
		return addressBooklist;
	}

	// find by id
	@GetMapping("/findById/{id}")
	public AddressBookModel setBook(@PathVariable int id) {
		AddressBookModel addressBookModel = repo.findById(id).get();
		return addressBookModel;
	}

	// update the data in the repo
	@PutMapping("/updateData/{id}")
	public AddressBookModel updateBookById(@PathVariable int id, @RequestBody AddressBookModel obj) {
		AddressBookModel addressBookModel  = new AddressBookModel(obj, id);
		repo.save(addressBookModel);
		
		return addressBookModel;
	}

	

	// delete by id
	@DeleteMapping("/delete/{id}")
	public String deleteAddressBookBYId(@PathVariable int id) {
	    repo.deleteById(id);
		return "person is sucussfully deleted from  address book";
	}

}