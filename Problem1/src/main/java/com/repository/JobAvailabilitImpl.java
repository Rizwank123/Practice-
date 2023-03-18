package com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Service.JobCounsaltency;
@Component
public class JobAvailabilitImpl implements JobAvailAbility {
	@Autowired
	@Qualifier("consaltancy")
	private JobCounsaltency jobCounsaltancy;
	

	public void setJobCounsaltancy(JobCounsaltency jobCounsaltancy) {
		this.jobCounsaltancy = jobCounsaltancy;
	}
	@Override
	public void FindJob(String msg) {
		// TODO Auto-generated method stub
		jobCounsaltancy.weAreHiring(msg);
		
		
	}
	public JobCounsaltency getJobCounsaltancy() {
		return jobCounsaltancy;
	}

}
