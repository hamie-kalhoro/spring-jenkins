package com.hamids.springjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Applicatin started...");
	}

	public static void main(String[] args) {
		logger.info("Applicatin executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
