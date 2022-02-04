package io.mtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@SpringBootApplication
@ComponentScans({@ComponentScan("io.mtech.config"), @ComponentScan("io.mtech.controller")})
public class SpringSecurityV2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityV2Application.class, args);
	}

}
