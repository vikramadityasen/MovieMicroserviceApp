package com.movie.app.movieeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaServer
public class MovieEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieEurekaServerApplication.class, args);
	}
}
