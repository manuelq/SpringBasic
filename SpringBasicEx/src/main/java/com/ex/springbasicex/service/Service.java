package com.ex.springbasicex.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Service {

	@Resource(name="myUrl")
	String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
}
