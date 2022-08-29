package com.generation.HelloWorld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ola")
@RestController
public class HelloWorldController {
	public String[] bsms = {"Orientacao ao futuro", "Responsabilidade Pessoal", "Mentalidade de Crescimento", "Persistencia",
			"Trabalho em equipe", "Orientacao ao detalhe", "Pro-atividade", "Comunicacao"};
	
	@GetMapping("/ola1")
	public String helloWorld() {
		return "Hello Generation Brasil!!!";
	}
	@GetMapping("/ola2")
	public String[] bsms() {
		return bsms;
		}
	@GetMapping("/ola3")
	public String objetivos() {
		return "Quero ficar craque no Springboot essa semana!";
	}

}



