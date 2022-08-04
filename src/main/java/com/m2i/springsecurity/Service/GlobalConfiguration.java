package com.m2i.springsecurity.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author elouf
 */
@Configuration
public class GlobalConfiguration {
    
    @Bean 
public BCryptPasswordEncoder  passwordEncoder (){
    return new BCryptPasswordEncoder ();
}
}
