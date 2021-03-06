package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dao.CartDao;

//@SpringBootApplication
//@ComponentScan(basePackages = {"com.example"})
public class TestDemoApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(TestDemoApplication.class, args);
	}
}
