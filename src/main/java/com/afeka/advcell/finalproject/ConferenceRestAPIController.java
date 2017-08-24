package com.afeka.advcell.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories("com.afeka.advcell.finalproject.db")
public class ConferenceRestAPIController {
	public static void main(String[] args) {
		SpringApplication.run(ConferenceRestAPIController.class, args);
	}
}
