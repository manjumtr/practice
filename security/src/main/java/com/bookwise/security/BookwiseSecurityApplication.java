package com.bookwise.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookwiseSecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookwiseSecurityApplication.class, args);
		System.out.println("Started..!!");
	}
}
