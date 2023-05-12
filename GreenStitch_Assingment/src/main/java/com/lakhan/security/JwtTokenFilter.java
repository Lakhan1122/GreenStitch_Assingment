package com.lakhan.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtTokenFilter extends GenericFilterBean{
	
	private final JwtTokenProvider jwtTokenProvider;

	public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
	    this.jwtTokenProvider = jwtTokenProvider;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
	    HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
	    HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

	    String token = jwtTokenProvider.resolveToken(httpServletRequest);
	    if (token != null && jwtTokenProvider.validateToken(token)) {
	        Authentication authentication = jwtTokenProvider.getAuthentication(token);
	        if (authentication != null) {
	            SecurityContextHolder.getContext().setAuthentication(authentication);
	        }
	    }

	    try {
			filterChain.doFilter(servletRequest, servletResponse);
		} catch (java.io.IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
