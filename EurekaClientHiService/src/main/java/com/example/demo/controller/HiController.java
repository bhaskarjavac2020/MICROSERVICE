package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.client.HelloClient;

@RestController
public class HiController {
	
	@Autowired
	private HelloClient helloClient;
	
	@GetMapping(value = "/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		String hiMsg="Hi ";
		String helloMsg=helloClient.invokeHelloService(name);
		return hiMsg+"---"+helloMsg;
	}
}
