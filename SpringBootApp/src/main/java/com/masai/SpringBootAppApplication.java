package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
	ApplicationContext	ctx=SpringApplication.run(SpringBootAppApplication.class, args);
	
	A a=ctx.getBean("a",A.class);
	
		a.funA();
		System.out.println("Hi");
	}

}
