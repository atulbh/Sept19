package com.java.Enum;

public enum Frequency {

	DAILY("Daily"),
	MONTHLY("Monthly"),
	YEARLY("Yearly");
	
	private String val;

	private Frequency(String val) {
		this.val = val;
	}
	
	public String getVal(){
		return val;
	}
	
}
