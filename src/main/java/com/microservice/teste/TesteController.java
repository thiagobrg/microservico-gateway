package com.microservice.teste;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
@CrossOrigin(originPatterns = "*", maxAge = 3600)
public class TesteController {

	
	@GetMapping
	public String teste() {
		return "1";
	}
}
