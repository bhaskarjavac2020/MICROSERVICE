package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	@GetMapping(value = "/hello/{name}")
	public String sayHi(@PathVariable("name") String name) {
		String msg="Hello "+name+" how are you???";
		return msg;
	}
}
