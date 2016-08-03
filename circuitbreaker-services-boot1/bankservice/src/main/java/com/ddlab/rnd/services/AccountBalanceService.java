package com.ddlab.rnd.services;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AccountBalanceService {

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "serviceFails")
	public String getAvailableBalance() {
		
		URI uri = URI.create("http://localhost:8090/accountservice/account");

	    return this.restTemplate.getForObject(uri, String.class);
	}
	
	public String serviceFails() {
		
		return "Currently Bank is under maintenance, please try after sometime.\n We deeply regret the inconvenience";
	}

}
