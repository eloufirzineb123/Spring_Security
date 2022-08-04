package com.m2i.springsecurity.Repository;

import com.m2i.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author elouf
 */
public interface UserRepository  extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
}
