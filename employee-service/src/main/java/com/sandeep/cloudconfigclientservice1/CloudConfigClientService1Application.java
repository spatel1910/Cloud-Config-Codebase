package com.sandeep.cloudconfigclientservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication

public class CloudConfigClientService1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigClientService1Application.class, args);
	}
	@Autowired
	public void setEnv(Environment e)
	{
		System.out.println(e.getProperty("msg"));
	}
}

