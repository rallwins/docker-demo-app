package com.anbugroups.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {

	@GetMapping("/test-docker-demo")
	public String getData() {
		return "docker-demo-test";
	}
}
