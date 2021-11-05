package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceController {
    @GetMapping("/roll-dice")
    public String diceRoll() { return "Dice";}

    @RequestMapping(path = "/roll-dice/{n}", method = RequestMethod.GET)
    @ResponseBody
    public String numberGuessed(@PathVariable int n, Model model){
        Number guess = new Number
        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound);
        if( n != int_random) {
            return "You didn't guess correct. The guess was " + int_random + " and you chose " +
                    n;
        } else {
            return "You guessed correct!";
        }
        model.addAttribute("guess", n);
    }
}
