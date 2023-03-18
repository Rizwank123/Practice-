package com.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Service.FullTimeJob;
import com.Service.JobCounsaltency;

@Configuration
@ComponentScan(basePackages = "com")
public class AapConfig {
	@Bean("consaltancy")
	
	public JobCounsaltency getType() {
		return new FullTimeJob();
	}

}
