package com.kruzer.rma.Controller;


import com.kruzer.rma.Model.Users;
import com.kruzer.rma.services.UserAppServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserAppController {

    UserAppServices userAppServices;

    @Autowired
    public UserAppController(UserAppServices userAppServices) {
        this.userAppServices = userAppServices;
    }

    // obsługa żądzania przekierowania na stronę formularza
    @GetMapping("/register")
    public String register(Model model){
        Users users = new Users();
        // dodajemy atrybut dla obiektu klasy Model ("nazwa stosowanana w html", nazwa bjektu Java)
        model.addAttribute("users", users);
        return "register";  // przekierowanie na widok formularza rejestracji (html)
    }
    // obsługa żądzania przekazania obiektu z formularz metodą post
    @PostMapping("/register")
    public String register(@ModelAttribute @Valid Users users, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "register";
        }
        // zapis do DB przez serwis użytkownika
        userAppServices.registerUser(users);
        return "registered";
    }
}



