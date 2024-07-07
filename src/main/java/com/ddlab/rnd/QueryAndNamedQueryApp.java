package com.ddlab.rnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ddlab.rnd")
public class QueryAndNamedQueryApp {

	public static void main(String[] args) {
		SpringApplication.run(QueryAndNamedQueryApp.class, args);
	}
}
