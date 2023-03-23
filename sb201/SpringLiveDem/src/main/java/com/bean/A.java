package com.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service(value = "a")
@Scope("prototype")
public class A {
	
	private B b1;
	@Autowired
	public A(B b1) {
		super();
		this.b1 = b1;
	}
	
	@PostConstruct
	public void setUp() {
		System.out.println("inside set up method");
	}
	
	@PreDestroy
	public void tearDown(){
		System.out.println("inside tear down method");
	}
	public void funA() {	
		System.out.println("inside funA of A");
		System.out.println("B object is :"+b1);
	}

}