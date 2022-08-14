package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.Alien;

@SpringBootApplication
@RestController 
@RequestMapping("/")
public class FirstH2Cons1Application {

	public static void main(String[] args) {
		SpringApplication.run(FirstH2Cons1Application.class, args);
	}
	

@GetMapping("/alien")
public String addAlien() {

	return "hello";
	
}

}
