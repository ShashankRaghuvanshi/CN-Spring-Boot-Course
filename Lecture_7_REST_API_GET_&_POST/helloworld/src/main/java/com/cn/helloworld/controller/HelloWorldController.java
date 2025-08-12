package com.cn.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello Coding Ninjas";
	}
	
	@GetMapping("hello-earth")
	public String helloEarth() {
		return "hello earth";
	}
	
	@GetMapping("hello-mars/{name}")
	public String helloFromMars(@PathVariable("name") String name) {
		return "hello from mars " + name;
	}
}
