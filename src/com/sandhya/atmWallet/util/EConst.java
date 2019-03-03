package com.sandhya.atmWallet.util;

public enum EConst {
	
	// Sample
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"),
	MAX(12), MIN(1);

	// declaring private variable for getting values
	private String action;

	// getter method
	public String getAction() {
		return this.action;
	}
	private int actionNum;

	// getter method
	public int getActionNum() {
		return this.actionNum;
	}


	// enum constructor - cannot be public or protected
	private EConst(String action) {
		this.action = action;
	}
	private EConst(int actionNum) {
		this.actionNum = actionNum;
	}
}
