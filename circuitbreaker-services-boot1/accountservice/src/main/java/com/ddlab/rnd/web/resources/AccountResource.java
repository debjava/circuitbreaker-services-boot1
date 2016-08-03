package com.ddlab.rnd.web.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AccountResource {

	@RequestMapping(value = "/account")
	public String getDetails() {
		return "Your current balance is Rs 5000/-";
	}

	public static void main(String[] args) {
		SpringApplication.run(AccountResource.class, args);
	}
}
