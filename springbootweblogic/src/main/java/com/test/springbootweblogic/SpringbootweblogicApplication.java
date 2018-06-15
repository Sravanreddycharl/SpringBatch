package com.test.springbootweblogic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;


@SpringBootApplication
public class SpringbootweblogicApplication extends SpringBootServletInitializer implements WebApplicationInitializer{

		public static void main(String[] args) {
			new SpringApplicationBuilder(SpringbootweblogicApplication.class).run(args);
		}

	
}
