package com.test.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class MainController {

	
	@PostMapping("/main")
	public String main() {
		return "main";
	}

	@PostMapping("/room")
	public String room() {
		return "room";
	}
}
