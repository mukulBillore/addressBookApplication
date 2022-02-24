package com.bridgelabz.addressBookApplication.dto;

import com.bridgelabz.addressBookApplication.model.AddressBookModel;

public class ResponseDTO {
	private String msg;
	private Object data;

	
	
	// constructor with string and model refrence as parameter
	public ResponseDTO(String msg, Object data) {
		super();
		this.msg = msg;
		this.data = data;
	}
	
	// default constructor
	public ResponseDTO() {
	}

	
	// getters and setters
	// why do we need getters and setters here
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


}
