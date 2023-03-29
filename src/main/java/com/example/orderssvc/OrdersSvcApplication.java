package com.example.orderssvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrdersSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersSvcApplication.class, args);
		System.out.println("Orders service UP!");
	}

}
