package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages ="com.bean"  )
@PropertySource("a1.properties")
public class AppConfig {
	@Bean("b2")
	@Primary
	public  B getB() {
		return new B();
	}

}
