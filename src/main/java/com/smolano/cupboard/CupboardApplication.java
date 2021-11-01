package com.smolano.cupboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class CupboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(CupboardApplication.class, args);
	}

}
