package io.mtech.config;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

@Configuration
//@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * /myAccount - Secured /myBalance - Secured /myLoans - Secured /myCards -
	 * Secured /notices - Not Secured /contact - Not Secured
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// Custom configuration as per our requirement

		http.cors().configurationSource(new CorsConfigurationSource() {

			@Override
			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
				CorsConfiguration config = new CorsConfiguration();
				config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
				config.setAllowedMethods(Collections.singletonList("*"));
				config.setAllowCredentials(true);
				config.setAllowedHeaders(Collections.singletonList("*"));
				config.setMaxAge(3600L);
				return config;
			}
		}).and().authorizeRequests()

				.antMatchers("/myAcconut").authenticated().antMatchers("/myBalance").authenticated()
				.antMatchers("/myLoans").authenticated().antMatchers("/myCard").authenticated().antMatchers("/notices")
				.permitAll().antMatchers("/contact").permitAll().anyRequest().authenticated().and().formLogin().and()
				.httpBasic();

		// Configure to deny all the requests
		/*
		 * http.authorizeRequests().anyRequest().denyAll() .and().formLogin()
		 * .and().httpBasic();
		 */
		/*
		 * //Configure to permit all the requests
		 * http.authorizeRequests().anyRequest().permitAll() .and().formLogin()
		 * .and().httpBasic();
		 */
//		http.formLogin();
//		http.httpBasic();
	}

	// Configuring users using inMemoryAuthentication
	/*
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * auth.inMemoryAuthentication().withUser("admin").password("12345").authorities
	 * ("admin").and() .withUser("user").password("1234").authorities("read").and()
	 * .passwordEncoder(NoOpPasswordEncoder.getInstance());
	 */

	// //Configuring users using InMemoryUserDetailsManager

	/*
	 * protected void configure(AuthenticationManagerBuilder auth) throws Exception
	 * { InMemoryUserDetailsManager userDetailsService = new
	 * InMemoryUserDetailsManager(); UserDetails user =
	 * User.withUsername("admin").password("1234").authorities("admin").build();
	 * UserDetails user1 =
	 * User.withUsername("user").password("1234").authorities("read").build();
	 * userDetailsService.createUser(user); userDetailsService.createUser(user1);
	 * auth.userDetailsService(userDetailsService); }
	 */

	/*
	 * @Bean public UserDetailsService userDetailsService(DataSource dataSource) {
	 * return new JdbcUserDetailsManager(dataSource); }
	 */

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
