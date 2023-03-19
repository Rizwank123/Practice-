package come.masai.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.masai.service.DeveloperService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		DeveloperService ds=(DeveloperService)ctx.getBean("devService");
		ds.printProjectMap();
		ds.printDeveloperList();
	}

}

