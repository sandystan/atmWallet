package com.sandhya.atmWallet.models.impl;

import java.io.Serializable;

import com.sandhya.atmWallet.models.decl.IATM;

public class ATM implements Serializable,IATM {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5176132363384211539L;
	/**
	 * Primary Key
	 */
	private String atmNumber;
	private int pin;
	/**
	 * Reference key to User
	 */
	private int userId;

	public String getAtmNumber() {
		return this.atmNumber;
	}

	public void setAtmNumber(String atmNumber) {
		this.atmNumber = atmNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
