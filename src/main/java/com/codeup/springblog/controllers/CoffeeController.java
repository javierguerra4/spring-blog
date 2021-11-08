package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Coffee;
import com.codeup.springblog.models.Coffee;
import com.codeup.springblog.repositories.CoffeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CoffeeController {
    private final CoffeeRepository coffeeRepository;

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

    @GetMapping("/coffee/create")
    public String showCreateCoffeeForm(Model model){
        model.addAttribute("coffee", new Coffee());
        return "coffees/create";
    }

    @PostMapping("/coffee/create")
    public String createCoffee(@RequestParam(name = "brand") String brand,
        @RequestParam(name = "origin") String origin, @RequestParam(name = "roast") String roast) {
        Coffee coffee= new Coffee(brand, origin, roast);
        coffeeRepository.save(coffee);
        return "redirect: /views-lec/coffee";
    }


}

