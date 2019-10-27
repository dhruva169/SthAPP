package com.macd.sth.controllers;


import com.macd.sth.dao.CreditDao;
import com.macd.sth.models.credit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/credit")
public class CreditController {

    @Autowired
    CreditDao creditDao;

    @RequestMapping("")
    public String base(){
        return "creditBase";
    }


// All Working

    @RequestMapping("/all")
    public String allCreditEntries(Model model){
        model.addAttribute("creditsAll", creditDao.getAllEntries());
        return "creditsAll";
    }

//

    @GetMapping("/{ID}")
    public String getByID(Model model, @PathVariable("ID") int custID){
        model.addAttribute("credit", creditDao.getCreditDetails(custID));
        return "creditByID";
    }

// Add Working

    @GetMapping("/add")
    public String addEntry(Model model){
        credit bd = new credit();
        model.addAttribute("newCredit",bd);
        return "creditAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newCredit") credit bd, BindingResult result, Model model){
        creditDao.enterEntry(bd);
        return "redirect:/credit/all";

    }

//  Update Working

    @GetMapping("/update")
    public String updateBD(Model model){
        credit bd = new credit();
        model.addAttribute("newCredit",bd);
        return "creditUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newBankDeposits") credit bd, BindingResult result, Model model){
        creditDao.updateEntry(bd);
        return "redirect:/credit/all";

    }



}
