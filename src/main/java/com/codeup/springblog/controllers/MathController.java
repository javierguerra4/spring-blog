package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "add/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String addNumbers(@PathVariable int num1, @PathVariable int num2) {
        int answer = num1 + num2;
        return num1 + " plus " + num2 + " = " + answer;
    }

    @RequestMapping(path = "subtract/{num1}/from/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractNumbers(@PathVariable int num1, @PathVariable int num2) {
        int answer = num2 - num1;
        return num2 + " minus " + num1 + " = " + answer;
    }

    @RequestMapping(path = "multiply/{num1}/and/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyNumbers(@PathVariable int num1, @PathVariable int num2) {
        int answer = num1 * num2;
        return num1 + " times " + num2 + " = " + answer;
    }

    @RequestMapping(path = "divide/{num1}/by/{num2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideNumbers(@PathVariable int num1, @PathVariable int num2) {
        int answer = num1 / num2;
        return num1 + " divided by " + num2 + " = " + answer;
    }
}
