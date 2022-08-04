package com.m2i.springsecurity.Service;

import com.m2i.springsecurity.Repository.UserRepository;
import com.m2i.springsecurity.model.Role;
import com.m2i.springsecurity.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IuserService {
    
    private UserRepository userRepository;
    private BCryptPasswordEncoder passwordEncoder;
    
    
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        
        User adminUser =new User("admin", "admin","admin@g.com", "admin");
        adminUser.setRole(Arrays.asList(new Role("ROLE_ADMIN")));
        adminUser.setPassword(passwordEncoder.encode(adminUser.getPassword()));
        userRepository.save(adminUser);
    }
    
    
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    
    @Override
    public User save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Arrays.asList(new Role("ROLE_USER")));  // tout les role doit commencer par ROLE_
        return userRepository.save(user);
    }
    
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
//        return new org.springframework.security.core.userdetails.User(user.getEmail(),
//                user.getPassword(),
//                mapRolesToAuthorities(user.getRole()));
           
               return user;
    }
  /*  
    private List<? extends GrantedAuthority> mapRolesToAuthorities(List<Role> roles) {
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        
//        for (Role r : roles) {
//            authorities.add(new SimpleGrantedAuthority(r.getName()));
//        }
//        
//        return authorities;
        
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }*/
}