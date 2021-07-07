package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class First {

	@RequestMapping("/")
	public String test() {
		return "sanjeev";
	}
}
