package com.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.api.controller,com.api.dao")
@EntityScan("com.api.model")
@EnableJpaRepositories("com.api.dao")

public class ToursandtravelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToursandtravelApplication.class, args);
	}

}
