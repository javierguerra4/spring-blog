package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/hello")
    @ResponseBody
    public String returnHello() {
        return "<h1>Hello World</h1>";
    }

    @GetMapping("/howdy")
    @ResponseBody
    public String returnHowdy() {
        return "<h1>Howdy World</h1>";
    }

    @GetMapping("/name")
    @ResponseBody
    public String returnName(@RequestParam(defaultValue = "Hello World") String n) {
        return "Returning name: " + n;
    }
}
