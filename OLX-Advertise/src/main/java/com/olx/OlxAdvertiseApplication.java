package com.olx;


import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class OlxAdvertiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxAdvertiseApplication.class, args);
	}

	@Bean
	public Docket getCuttomizedDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.olx"))
				.paths(PathSelectors.any()).build().apiInfo(getInfo());
	}

	private ApiInfo getInfo() {
// TODO Auto-generated method stub
		ApiInfo apiInfo = new ApiInfo("Swagger Restful Api Documentation",
				"This page given REST API Documentation for Advertisement", "2.5", "My Teams of Service",
				new Contact("Shubham kandu", "http://ShubhamGupta.com", "Shubham99@gmail.com"), "GPL", "http://gpl.org",
				new ArrayList<VendorExtension>());
		return apiInfo;
	}
}