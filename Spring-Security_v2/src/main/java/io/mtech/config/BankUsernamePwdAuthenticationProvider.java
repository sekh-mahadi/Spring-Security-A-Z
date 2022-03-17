package io.mtech.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import io.mtech.model.Authority;
import io.mtech.model.Customer;
import io.mtech.repository.CustomerRepository;

@Component
public class BankUsernamePwdAuthenticationProvider implements AuthenticationProvider {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String userName = authentication.getName();
		String pwd = authentication.getCredentials().toString();
		List<Customer> customers = customerRepository.findByEmail(userName);
		if (customers.size() > 0) {
			if (passwordEncoder.matches(pwd, customers.get(0).getPwd())) {

				return new UsernamePasswordAuthenticationToken(userName, pwd,
						getGranteAuthorities(customers.get(0).getAuthorities()));
			} else {
				throw new BadCredentialsException("Invalid password!");
			}
		} else {
			throw new BadCredentialsException("No user registered with this details!");
		}
	}

	private List<GrantedAuthority> getGranteAuthorities(Set<Authority> authorities) {
		List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
		for (Authority authority : authorities)
			grantedAuthorities.add(new SimpleGrantedAuthority(authority.getName()));

		return grantedAuthorities;

	}

	@Override
	public boolean supports(Class<?> authenticationType) {
		return authenticationType.equals(UsernamePasswordAuthenticationToken.class);
	}

}
