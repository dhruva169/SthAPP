package com.macd.sth.controllers;


import com.macd.sth.dao.CustomerDao;
import com.macd.sth.models.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/customer")
@Controller
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @GetMapping("")
    public String base(){
        return "customerBase";
    }



    @GetMapping("/all")
    public String allCustomers(Model model){
        model.addAttribute("allCustomers", customerDao.getAllCustomers());
        return "customerAll";
    }

    @GetMapping("/{ID}")
    public String getCustomerDetails(Model model, @PathVariable("ID") int custID ){
        model.addAttribute("custDetails", customerDao.getCustomerDetails(custID));
        return "customerByID";
    }

//   Add Working

    @GetMapping("/add")
    public String addEntry(Model model){
        customer bd = new customer();
        model.addAttribute("newCustomer",bd);
        return "customerAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newCustomer") customer bd, BindingResult result, Model model){
        customerDao.addCustomer(bd);
        return "redirect:/customer/all";

    }

// Update Working

    @GetMapping("/update")
    public String updateBD(Model model){
        customer bd = new customer();
        model.addAttribute("newBankDeposits",bd);
        return "customerUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newBankDeposits") customer bd, BindingResult result, Model model){
        customerDao.updateCustomerDetails(bd);
        return "redirect:/customer/";

    }

}
