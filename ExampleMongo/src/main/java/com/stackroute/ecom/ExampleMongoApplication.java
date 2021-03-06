package com.stackroute.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.stackroute.ecom.filter.MyFilter;

@SpringBootApplication
public class ExampleMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMongoApplication.class, args);
	}
//
//	@Bean
//	public CorsFilter corsMyconfig()
//	{
//		
//		UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
//		
//		CorsConfiguration config=new CorsConfiguration();
//		
//		config.setAllowCredentials(true);
//        config.addAllowedOrigin("*");
//        config.addAllowedHeader("*");
//		config.addAllowedMethod("*");
//	   source.registerCorsConfiguration("/**", config);	
//		return new CorsFilter(source);
//		
//	}
	
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
		
		fbean.addUrlPatterns("/api/mongo/*");
		
		return fbean;
		
		
		
	}
	
	
	
}
