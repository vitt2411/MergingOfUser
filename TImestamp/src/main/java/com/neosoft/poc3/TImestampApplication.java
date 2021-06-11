package com.neosoft.poc3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.neosoft.poc3.service.InsuranceService;

@SpringBootApplication
public class TImestampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TImestampApplication.class, args);

		InsuranceService bean = context.getBean(InsuranceService.class);

		bean.saveData();

		System.out.println("hello there ");
		
		System.out.println("heloo there 2");
		System.out.println("heloo there 2");
		System.out.println("heloo there 2");
	}

}
