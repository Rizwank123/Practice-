package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class A {
	
	
	private D b1;
	
	
	public D getB1() {
		return b1;
	}

	@Autowired
	public void setB1(D b1) {
		this.b1 = b1;
	}


	public void funA() {
		System.out.println("Inside funA of A");
		b1.funB();
	}
}
