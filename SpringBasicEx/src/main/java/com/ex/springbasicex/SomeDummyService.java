package com.ex.springbasicex;

import java.util.ArrayList;
import java.util.List;

public class SomeDummyService {
	public B getSubClass(Long id){
		return new B();
	}
	
	public List<? extends A> getSubClassAsList(){
		List<B> results = new ArrayList<B>();
		results.add(new B());
		return results;
	}
}
