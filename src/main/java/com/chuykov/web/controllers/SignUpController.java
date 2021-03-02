package com.chuykov.web.controllers;

import com.chuykov.web.forms.UserForm;
import com.chuykov.web.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signUp")
    public String signUpUser(UserForm userForm) {
        signUpService.signUp(userForm);
        return "redirect:/signIn";
    }

    @GetMapping("/signUp")
    public String getSignUpPage(Authentication authentication, Model model) {
        if (authentication == null) {
            model.addAttribute("userForm", new UserForm());
            return "sign_up_page";
        } else {
            return "redirect:/";
        }
    }
}
