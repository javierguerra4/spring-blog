package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class DiceController {
    @GetMapping("/dice-roll")
    public String diceRoll() { return "dice-roll";}

    @GetMapping("/dice-roll/{number}")
    public String showRoll(@PathVariable String number, Model model){
        int randomRoll = (int) (Math.random() * 6) + 1 ;
        boolean guessedRight = Integer.parseInt(number) == randomRoll;
        model.addAttribute("roll", randomRoll);
        model.addAttribute("guess", number);
        model.addAttribute("guessedRight", guessedRight);
        return "dice-roll";
    }

//    @RequestMapping(path = "/roll-dice/{n}", method = RequestMethod.GET)
//    @ResponseBody
//    public String numberGuessed(@PathVariable int n, Model model){
//        Number guess = new Number(n, )
//        Random rand = new Random();
//        int upperbound = 7;
//        int int_random = rand.nextInt(upperbound);
//        if( n != int_random) {
//            return "You didn't guess correct. The guess was " + int_random + " and you chose " +
//                    n;
//        } else {
//            return "You guessed correct!";
//        }
//        model.addAttribute("guess", n);
//    }

}
