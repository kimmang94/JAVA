package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

		var test = new Friend("lee");
		System.out.println(test.name);

	}

}
class Friend{
	String name = "kim";
	int age = 20;
	Friend(String name){
		this.name = name;
	}
}