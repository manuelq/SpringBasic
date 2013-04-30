package com.ex.springbasicex.enums;

public enum MyEnum {

	ABC("some string a"), 
	DEF("some string b"), 
	GHI("another string");

	String value;

	private MyEnum(String value) {
	    this.value = value;
	}

	public String value() {
	    return this.value;
	}
	
	public String toString() {
	    return this.value;
	}
}
