package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/demo")
public class DemoController {
	@GetMapping("/get-all")
	public ResponseEntity<String> getAllAccounts() {
		return ResponseEntity.ok("This is response from get API");
	}
}
