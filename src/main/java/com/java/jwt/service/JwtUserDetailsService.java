package com.java.jwt.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("lijo".equals(username)) {
			return new User("lijo", "$2a$10$P6fOKCbC4S.AwQ7huvV0xuHXtGcNk.UvsYMB5QYEqeW5SK/TZyU26", new ArrayList<>());
		}
		else throw new UsernameNotFoundException("Username not found"+ username);
	}

}
