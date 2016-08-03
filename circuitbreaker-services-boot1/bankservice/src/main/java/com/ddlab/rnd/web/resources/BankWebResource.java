package com.ddlab.rnd.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.services.AccountBalanceService;


@EnableCircuitBreaker
@RestController
@SpringBootApplication
@ComponentScan(basePackages={"com.ddlab.rnd.*"})
public class BankWebResource {

	@Autowired
	private AccountBalanceService balanceService;

	@RequestMapping("/balance")
	public String getBalance() {
		return balanceService.getAvailableBalance();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BankWebResource.class, args);
	}

}
