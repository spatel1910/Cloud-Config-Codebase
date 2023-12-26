package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigDemoApplication.class, args);
	}


	@GetMapping("/api")
	public String getApi(){
		return "This is server 8080";
	}

}
