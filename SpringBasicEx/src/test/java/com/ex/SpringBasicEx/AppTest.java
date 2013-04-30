package com.ex.SpringBasicEx;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ex.springbasicex.service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class AppTest {
	@Resource(name="list1")
	List<String> list1;
	
	@Resource(name="list2")
	List<String> list2;

	@Resource(name="myMap")
	Map<String,String> map;
	
	@Autowired
	Service service;
	
	@Test
	public void testList1Values(){
		Assert.assertEquals(3, list1.size());
	}
	
	@Test
	public void testMapValues(){
		Assert.assertEquals("mapped output 1",map.get("some string a"));
	}
	
	
	@Test
	public void testREsValues(){
		Assert.assertNotNull(service.getUrl());
	}
}
