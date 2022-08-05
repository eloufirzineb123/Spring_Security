package com.m2i.springsecurity.Controler;

import com.m2i.springsecurity.Service.IuserService;
import com.m2i.springsecurity.model.User;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author elouf
 */
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    
    private IuserService userService;

    public UserRegistrationController(IuserService userService) {
        this.userService = userService;
    }
    
    @ModelAttribute("user")
    public User userAttribute(){
        return new User();
    }
    
    @GetMapping
    public String showRegistrationForm(Model model){
        return "registration";
        
    }
    
    
    @PostMapping
    public String registrationUserAccount(@ModelAttribute("user")  @Valid User user, BindingResult result){
        User existing =userService.findByEmail(user.getEmail());
        if(existing!=null){
            result.rejectValue("email", null, "There is already an account registrered with that email");
        }
        if(result.hasErrors()){
            return "registration";
        }
        userService.save(user);
        return "redirect:/registration?success=true";
    }
    
    
    
    
}
