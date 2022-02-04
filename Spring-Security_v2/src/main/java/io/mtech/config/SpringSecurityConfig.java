package io.mtech.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	/* /myAccount - Secured
	 * /myBalance - Secured
	 *  /myLoans - Secured
	 *  /myCards - Secured 
	 *  /notices - Not Secured
	 *  /contact - Not Secured
	*/
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()

				.antMatchers("/myAcconut").authenticated()
				.antMatchers("/myBalance").authenticated()
				.antMatchers("/myLoans").authenticated()
				.antMatchers("/myCard").authenticated()
				.antMatchers("/notices").permitAll()
				.antMatchers("/contact").permitAll().anyRequest().authenticated().and()
				.formLogin().and()
				.httpBasic();
//		http.formLogin();
//		http.httpBasic();
	}

}
