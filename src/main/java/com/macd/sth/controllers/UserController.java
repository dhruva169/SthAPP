package com.macd.sth.controllers;

import com.macd.sth.dao.EmployeeDao;
import com.macd.sth.dao.SecurityService;
import com.macd.sth.models.employee;
import com.macd.sth.validator.employeeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private EmployeeDao userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private employeeValidator userValidator;

    @RequestMapping("")
    public String base(){
        return "base";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new employee());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") employee userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }
        userForm.setDesignation("employee");
        userService.addEmployee(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPassword());

        return "redirect:/home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/home")
    public String basea(){
        return "redirect:/home";
    }



    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public String home(Model model) {
        return "home";
    }
}