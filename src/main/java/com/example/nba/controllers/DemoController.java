package com.example.nba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")            //  this will add users to the start of all URL endpoints
public class DemoController {

    @RequestMapping("/nba")                                    //  this code will be reached by /test/nba
    public String nba(Model model) {
        //  Present the nbaTeams page which allows you to search for teams by conference
        return "basketball";
    }

    @RequestMapping("/homes")                                    //  this code will be reached by /test/homes
    public String homes(Model model) {
        //  present the homes page to search for homes by price, size, ... any where in the US of A
        return "homes";
    }

    @RequestMapping("/mlb")                                    //  this code will be reached by /test/mlb
    public String mlb(Model model) {
        //  present the MLBTeams page to search by league and year
        return "baseball";
    }
}
