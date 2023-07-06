package com.ITon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitCoinService {
	
	private final RestTemplate restTemplate;
	@Autowired
	public BitCoinService(RestTemplate restTemplate) {
		this.restTemplate=new RestTemplate();
	}

	public String apiCall() {
		return restTemplate.getForObject("", String.class);
	}
	

}
