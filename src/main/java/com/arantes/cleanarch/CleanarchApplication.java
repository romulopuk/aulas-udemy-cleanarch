package com.arantes.cleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@SpringBootApplication
public class CleanarchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanarchApplication.class, args);
	}

}
