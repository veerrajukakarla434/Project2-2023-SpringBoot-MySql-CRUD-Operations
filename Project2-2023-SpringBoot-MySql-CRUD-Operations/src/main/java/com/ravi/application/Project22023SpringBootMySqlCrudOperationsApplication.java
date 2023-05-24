package com.ravi.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(info = @Info(title = "Employee Project", version = "0.0.1-SNAPSHOT", description = "Employee Service Operations", termsOfService = "java springboot service", contact = @Contact(name = "ravi", email = "ravi@gmail.com"), license = @License(name = "ravi", url = "http://youtube.com/vkakarla")))
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.ravi.repositories" })
@ComponentScan(value = "com.ravi.*")
@EntityScan(basePackages = { "com.ravi.entities" })
public class Project22023SpringBootMySqlCrudOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project22023SpringBootMySqlCrudOperationsApplication.class, args);
	}

}
