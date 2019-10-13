package com.stackroute.ApiInterfaceServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@EnableZuulProxy
public class ApiInterfaceServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiInterfaceServicesApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String home() {
		return "API_Interface Micro Services Eureka Client application";
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}

}
