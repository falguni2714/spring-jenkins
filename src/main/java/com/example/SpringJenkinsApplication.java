package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@javax.annotation.PostConstruct
	public void intt()
	{
		logger.info("application started falguni...");
	}
	
	public static void main(String[] args) {
		logger.info("application executed falguni..");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
