package com.ex.springbasicex;

public class TestBean {

	public String saltSizeBytes;
	public String algorithm;
	public String getSaltSizeBytes() {
		return saltSizeBytes;
	}
	public void setSaltSizeBytes(String saltSizeBytes) {
		this.saltSizeBytes = saltSizeBytes;
	}
	public String getAlgorithm() {
		return algorithm;
	}
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
	
	protected void someMethod(){
		System.out.println("test");
	}
 
}
