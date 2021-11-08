package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Coffee;
import com.codeup.springblog.models.Coffee;
import com.codeup.springblog.repositories.CoffeeRepository;
import com.codeup.springblog.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CoffeeController {
    private final CoffeeRepository coffeeRepository;
    private final EmailService emailService;

    public CoffeeController(CoffeeRepository coffeeRepository){

        this.coffeeRepository = coffeeRepository;
    }
    @GetMapping("/coffee")
    public String coffeeInfo(){
        return "views-lec/coffee";
    }

    @GetMapping("/coffee/{roast}")
    public String roastSelection(@PathVariable String roast, Model model){
        model.addAttribute("selections", coffeeRepository.findByRoast(roast));
        return "views-lec/coffee";
    }

    @PostMapping("/coffee")
    public String newsletterSignup(@RequestParam(name="email") String email, Model model){
        model.addAttribute("email", email);
        emailService.prepareAndSend(email, "Thank you for signing up fot our coffee newsletter!");
        return "/coffees/coffee";
    }

    @GetMapping("/coffee/create")
    public String showCreateCoffeeForm(Model model){
        model.addAttribute("coffee", new Coffee());
        return "coffees/create";
    }

    @PostMapping("/coffee/create")
    public String createCoffee(@ModelAttribute Coffee coffee){
        coffeeRepository.save(coffee);
        return "redirect: /views-lec/coffee";
    }


}

