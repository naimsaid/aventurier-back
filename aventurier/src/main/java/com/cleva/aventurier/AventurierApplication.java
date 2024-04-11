package com.cleva.aventurier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AventurierApplication {

	public static void main(String[] args) {
		SpringApplication.run(AventurierApplication.class, args);
	}

}
