package com.springrestbasicauthentication.springrestbasicauthentication.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springrestbasicauthentication.springrestbasicauthentication")
public class HelloWorldConfiguration {
	

}