package com.bridgelabz.addressBookAppInSpring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressBookAppInSpring.dto.AddressBookDTO;
import com.bridgelabz.addressBookAppInSpring.dto.ResponseDTO;
import com.bridgelabz.addressBookAppInSpring.model.AddressBookModel;
import com.bridgelabz.addressBookAppInSpring.service.AddressBookService;

@RestController
public class Controller {

	@Autowired
	AddressBookService service;

	// hello msg printing 
	@GetMapping("/hello")
	public String sayHello() {
		return "welocome to Address book ";
	}

	// hello msg with name
	@PostMapping("/helloByName")
	public String mapbyName(@RequestParam String name) {
		return name + " ! welcome to Address book system";
	}

	// Saving the data in the local modal object. 
	@PostMapping("/saveData")
	public String setBook(@RequestBody AddressBookModel addressBookobj) {
		String msg = service.saveBook(addressBookobj);
		return msg;
	}

	// save the data in the repo by dto
	@PostMapping("/save")
	public ResponseEntity<ResponseDTO> savedatabyDTO( @Valid @RequestBody AddressBookDTO addressBookdto) {
		AddressBookModel newAddressBook = service.saveAddressBookDataByDTO(addressBookdto);
		ResponseDTO responsedto = new ResponseDTO("sucussfully saved contect", newAddressBook);
		return new ResponseEntity(responsedto, HttpStatus.OK);
	}

	// find all by id
	@GetMapping("/findAll")
	public List<AddressBookModel> findAll() {
		List<AddressBookModel> addressBooklist = service.findAll();
		return addressBooklist;
	}

	// find by id
	@GetMapping("/findById/{id}")
	public AddressBookModel setBook(@PathVariable int id) {
		AddressBookModel addressBookModel = service.findBookById(id);
		return addressBookModel;
	}

	// update the data in the repo
	@PutMapping("/updateData/{id}")
	public AddressBookModel updateBookById(@PathVariable int id, @RequestBody AddressBookModel obj) {
		AddressBookModel addressBookModel = service.updatebyID(id, obj);
		return addressBookModel;
	}

	// update the data in the repo by dto
	@PostMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateDatabyDTOUsingId(@Valid @RequestBody AddressBookDTO addressBookdto,
			@PathVariable int id) {
		AddressBookModel newAddressBook = service.updateAddressBookDataByDTO(addressBookdto, id);
		ResponseDTO dto = new ResponseDTO("sucussfully updated contect", newAddressBook);
		return new ResponseEntity(dto, HttpStatus.OK);
	}

	// delete by id
	@DeleteMapping("/delete/{id}")
	public String deleteAddressBookBYId(@PathVariable int id) {
		String msg = service.deletebyID(id);
		return msg;
	}

}