package com.chetan.eurekaserver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication
{

	private static Logger LOGGER = LogManager.getLogger(EurekaServerApplication.class);
	
	public static void main(String[] args) 
	{
		LOGGER.info("\n\n\n EurekaServerApplication - main \n\n\n");
		
		System.out.println("EurekaServerApplication - main\n\n");
		
		SpringApplication.run(EurekaServerApplication.class, args);
		
	}

	

}
