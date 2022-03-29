package io.mtech.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class AuthoritiesLoggingAfterFiter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
Authentication authentication = SecurityContextHolder.getContext().getAuthentication();		
	if(null!=authentication) {
		log.info("User: "+authentication.getName()+" is Successfully authenticated and "
	+"has the authorities "+authentication.getAuthorities().toString());
		
	}
	chain.doFilter(request, response);
	}

}
