package com.fabionobre.loja;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicacaoPrincipal implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(AplicacaoPrincipal.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
	}	
}
