package com.SpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/Hi")
	public String sayHi() {
		return "Hello";
	}
}
