package com.m2i.springsecurity.Service;

import com.m2i.springsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author elouf
 */
public interface IuserService extends UserDetailsService {
    User findByEmail(String email);
    
    User save(User user);
    
    
}
