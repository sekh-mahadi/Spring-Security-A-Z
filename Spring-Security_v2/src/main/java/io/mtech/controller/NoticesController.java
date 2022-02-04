package io.mtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
	@GetMapping("/notices")
	public String getNoticessDetails() {
		return "Here are the Notice Details from the DB";
	}
}
