package com.m2i.springsecurity.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author elouf
 */
@Controller
public class MainController {
    
    @GetMapping("/")
    public String root(){
        return "index";
    }
    
     @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
}
