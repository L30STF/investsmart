package com.investsmart;

import org.springframework.boot.SpringApplication;

public class TestInvestsmartBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(InvestsmartBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
