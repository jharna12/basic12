package com.example.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.blog.Controller"})
public class BasicCrudWithMysqlApplication {
     // modify 
	public static void main(String[] args) {
		SpringApplication.run(BasicCrudWithMysqlApplication.class, args);
	}

}
