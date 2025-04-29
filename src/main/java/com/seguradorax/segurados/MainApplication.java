package com.seguradorax.segurados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainApplication {

	@RequestMapping("/home")
	String home(){
		return "Bem-vindo(a)";
	}

	public static void main(String[] args) {

		SpringApplication.run(com.seguradorax.segurados.MainApplication.class, args);
	}
}