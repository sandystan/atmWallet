package com.sandhya.atmWallet.models.impl;

import java.io.Serializable;

import com.sandhya.atmWallet.models.decl.IUser;


/**
 * 
 * @author Sandy
 *
 */
public class User implements IUser,Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * @primary key
	 */
	private int userId;

	private String username;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String city;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
