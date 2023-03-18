package com.Service;

import org.springframework.stereotype.Service;

@Service
public class FullTimeJob implements JobCounsaltency {

	@Override
	public void weAreHiring(String msg) {
		// TODO Auto-generated method stub
		System.out.println("FullTime:  "+msg);
	}

	

	
}
