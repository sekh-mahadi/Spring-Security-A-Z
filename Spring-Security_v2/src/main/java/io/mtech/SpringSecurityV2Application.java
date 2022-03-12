package io.mtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*@ComponentScans({@ComponentScan("io.mtech.config"), @ComponentScan("io.mtech.controller")})
@EnableJpaRepositories("io.mtech.repository")
@EntityScan("io.mtech.model")*/
@SpringBootApplication
public class SpringSecurityV2Application {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityV2Application.class, args);
	}
}
