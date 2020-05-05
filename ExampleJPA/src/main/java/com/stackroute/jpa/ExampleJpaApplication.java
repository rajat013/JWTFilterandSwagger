package com.stackroute.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

 

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ExampleJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleJpaApplication.class, args);
	}
	
	@Bean
	public Docket myinfo()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.stackroute.jpa"))
				.build()
				.apiInfo(getapi()).useDefaultResponseMessages(false);
		
	}

	private ApiInfo getapi()
	{
		
		ApiInfoBuilder apibuilder=new ApiInfoBuilder();
		apibuilder.title("USTG sample Document").version("V2")
		.license("Mary@Stackroute.in")
		.description("This api is used for accessing prodcut infor");
		
		return apibuilder.build();
	}
	
	@Bean
	
	public FilterRegistrationBean myfilter()
	{
		
UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
		
		CorsConfiguration config=new CorsConfiguration();
		
		config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
		config.addAllowedMethod("*");
	   source.registerCorsConfiguration("/**", config);	
		FilterRegistrationBean fbean=new FilterRegistrationBean(new CorsFilter(source));
		
		
		fbean.setFilter(new MyFilter());
		
		fbean.addUrlPatterns("/api/ustg/*");
		
		return fbean;
		
		
		
	}
	
}
