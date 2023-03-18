package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Config.AapConfig;
import com.Service.FullTimeJob;
import com.Service.PartTimeJob;
import com.Service.WeekendsJob;
import com.repository.JobAvailabilitImpl;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AapConfig.class);
		JobAvailabilitImpl availability=ctx.getBean(JobAvailabilitImpl.class);
		//full time job is by default autowired
		availability.FindJob("Developer");
		FullTimeJob fullTimeJob=ctx.getBean("fullTimeJob",FullTimeJob.class);
		availability.setJobCounsaltancy(fullTimeJob);
		availability.FindJob("Java Developer");
		
		
		
		PartTimeJob partTimeJob=ctx.getBean("partTime" ,PartTimeJob.class);
		availability.setJobCounsaltancy(partTimeJob);
		availability.FindJob("Assistance");
		
		
		WeekendsJob weekendsJob=ctx.getBean("weekendJob",WeekendsJob.class);
		availability.setJobCounsaltancy(weekendsJob);
		availability.FindJob("Teaching");

	}

}
