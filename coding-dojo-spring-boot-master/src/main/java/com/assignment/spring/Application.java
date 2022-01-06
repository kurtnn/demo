package com.assignment.spring;

import com.assignment.spring.configuration.ConfigurationMarkerInterface;
import com.assignment.spring.controller.ControllerMarkerInterface;
import com.assignment.spring.entity.EntityMarkerInterface;
import com.assignment.spring.exception.ExceptionMarkerInerface;
import com.assignment.spring.repository.RepositoryMarkerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {ConfigurationMarkerInterface.class, ControllerMarkerInterface.class,
		EntityMarkerInterface.class, ExceptionMarkerInerface.class, RepositoryMarkerInterface.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
