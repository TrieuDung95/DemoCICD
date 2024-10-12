package com.example.demoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoSpringApplication.class);
		SpringApplication.run(DemoSpringApplication.class, args);
	}

	@RequestMapping("/")
    public String home() {
            return "Hello World!";
    }
}
