package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationCotext.xml");
		
		A obj =  ctx.getBean("a",A.class);
		
		obj.funA();
		
	}
}
