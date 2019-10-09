package com.macd.sth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String welcome() {
        return "index.jsp";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String welcome(Model model) {
        model.addAttribute("name", "Home Page");
        model.addAttribute("description", "Page yet to be completed!");
        return "home.jsp";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model) {
        return "login.jsp";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {
        return "login.jsp";
    }

    @RequestMapping(value = "/loginError", method = RequestMethod.GET)
    public String loginError(ModelMap model) {
        model.addAttribute("error", "true");
        return "login.jsp";
    }

    


}



