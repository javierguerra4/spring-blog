package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CoffeeController {
    @GetMapping("/coffee")
    public String coffeeInfo(){
        return "views-lec/coffee";

    }
//    Like request.getparameter
    @GetMapping("/coffee/{roast}")
    public String roastSelection(@PathVariable String roast, Model model) {
        model.addAttribute("roast", roast);
        boolean choseDark = false;
        if(roast.equals("dark")){
            choseDark = true;
        }
        model.addAttribute("choseDark", choseDark);
        return "views-lec/coffee";
    }
}
