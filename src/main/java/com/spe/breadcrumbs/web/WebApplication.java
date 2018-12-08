package com.spe.breadcrumbs.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.util.Optional;
import java.util.Properties;

@SpringBootApplication
public class WebApplication {
	// Get PORT and HOST from Environment or set default
	private static final Optional<String> host;
	private static final Optional<String> port;
	private static final Properties myProps = new Properties();
	static {
		host = Optional.ofNullable(System.getenv("HOSTNAME"));
		port = Optional.ofNullable(System.getenv("PORT"));
	}

	public static void main(String[] args) {

		DBConnection dbConnection = new DBConnection();
		Connection connection = dbConnection.getConnection();

		//Set Properties
		myProps.setProperty("server.address", host.orElse("localhost"));
		myProps.setProperty("server.port", port.orElse("8080"));

		SpringApplication app = new SpringApplication(WebApplication.class);
		app.setDefaultProperties(myProps);
		app.run(args);
	}
}
