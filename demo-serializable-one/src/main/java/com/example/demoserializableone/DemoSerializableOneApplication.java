package com.example.demoserializableone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class})
public class DemoSerializableOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSerializableOneApplication.class, args);
	}

}
