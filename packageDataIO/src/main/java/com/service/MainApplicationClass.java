package com.service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;





@SpringBootApplication
@ComponentScan(basePackageClasses=com.controller.LabelDataController.class)
@MapperScan("com.mapper")

public class MainApplicationClass extends SpringBootServletInitializer
{  
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainApplicationClass.class);
	}
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplicationClass.class, args);
    }
}
