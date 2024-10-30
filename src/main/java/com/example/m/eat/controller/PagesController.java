package com.example.m.eat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

	@GetMapping("/")
    public string index () {
		return "page/index"
	}
}
