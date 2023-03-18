package com.Service;

import org.springframework.stereotype.Service;

@Service("weekendJob")
public class WeekendsJob  implements JobCounsaltency{

	@Override
	public void weAreHiring(String msg) {
		// TODO Auto-generated method stub
		System.out.println("WeekendsJob:  "+msg);
		
	}

}
