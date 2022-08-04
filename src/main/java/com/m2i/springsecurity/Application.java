/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m2i.springsecurity;

import com.m2i.springsecurity.Service.IuserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author elouf
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
            
            ApplicationContext ctx= SpringApplication.run(Application.class, args);
            
//            IuserService userService = ctx.getBean(IuserService.class);
//            
//            
//            userService.save(user)
            
	}

}
