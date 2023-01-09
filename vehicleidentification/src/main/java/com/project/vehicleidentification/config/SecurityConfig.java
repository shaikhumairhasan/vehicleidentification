package com.project.vehicleidentification.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        
		http
			.authorizeHttpRequests()
			.requestMatchers("/", "/home", "/about","/owner", "/imageUpload/**", "/css/**", "/js/**", "/images/**")
			.permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login").permitAll()
			.defaultSuccessUrl("/admin", true)
			.usernameParameter("username")
			.passwordParameter("password")
			.and()
			.logout()
            .permitAll().logoutUrl("/logout");
		
		return http.build();
    }
	
}
