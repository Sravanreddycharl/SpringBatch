package com.test.springbootweblogic;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringbootweblogicApplication extends SpringBootServletInitializer implements WebApplicationInitializer{

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringbootweblogicApplication.class).run(args);
	}
}
