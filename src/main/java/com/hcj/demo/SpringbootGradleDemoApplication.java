package com.hcj.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.sql.DataSourceDefinition;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootGradleDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleDemoApplication.class, args);
	}

}
