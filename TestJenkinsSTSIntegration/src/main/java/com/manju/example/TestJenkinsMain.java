package com.manju.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestJenkinsMain {

	@RequestMapping(value="/getMessage")
	public String getMessage() {
		return "Welcome.! Jenkins Build and Deployment Succesful.!";
	}
}
