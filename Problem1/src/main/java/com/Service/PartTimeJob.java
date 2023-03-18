package com.Service;

import org.springframework.stereotype.Service;

@Service("partTime")
public class PartTimeJob implements JobCounsaltency {

	@Override
	public void weAreHiring(String msg) {
		// TODO Auto-generated method stub
		System.out.println("PartTime:  "+msg);
	}

	

	

}
