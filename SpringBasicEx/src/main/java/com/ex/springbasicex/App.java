package com.ex.springbasicex;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void  main(String[] args) throws Exception {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("META-INF/applicationContext-user.xml");
		TestBean test = (TestBean) appContext.getBean("jasyptStringDigester");
		System.out.println(test.getSaltSizeBytes());
		SomeDummyService serv = new SomeDummyService();
		A var = serv.getSubClass(1l);
		List<? extends A>results = serv.getSubClassAsList();
	}
}
