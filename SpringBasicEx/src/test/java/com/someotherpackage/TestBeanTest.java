package com.someotherpackage;

import java.text.NumberFormat;
import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;

import com.ex.springbasicex.TestBean;

public class TestBeanTest {

	@Test
	public void test() {
		MyTestBean bean = new MyTestBean();
		bean.someMethod();
	}
	
	
	class MyTestBean extends TestBean{

		@Override
		public void someMethod() {
			// TODO Auto-generated method stub
			super.someMethod();
		}
		
	} 
	
	
	@Test
	public void test2() {
		double myNum = 654981231231233127d;
		System.out.println(NumberFormat.getInstance().format(myNum));
	}
	
	@Test
	public void test3(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("chat", "hello");
		map.put("chat.echo", "world");
		String value = map.get("chat.echo");
		Assert.assertEquals("world",value);
		System.out.println(value);
	}

}
