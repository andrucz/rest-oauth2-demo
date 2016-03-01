package com.andrucz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {
	
	@RequestMapping(path = "/hello")
	public String hello() {
		return "hello!";
	}

}
