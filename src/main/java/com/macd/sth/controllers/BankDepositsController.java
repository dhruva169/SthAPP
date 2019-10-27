package com.macd.sth.controllers;


import com.macd.sth.dao.BankDepositsDao;
import com.macd.sth.models.bankDeposits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/bankDeposits")
@Controller
public class BankDepositsController {

    @Autowired
    BankDepositsDao bankDepositsDao;

    @RequestMapping("")
    public String baseDeposit(){
        return "depositBase";
    }

//    All entries working

    @RequestMapping("/all")
    public String allDeposits(Model model){
        model.addAttribute("allDeposits", bankDepositsDao.getAllBankDeposits());
        return "depositsAll";
    }

//

    @GetMapping("/{depositDate}")
    public String byDate(Model model, @PathVariable("depositDate") String depositDate){
        model.addAttribute("bankDeposits", bankDepositsDao.getAmountDepositedByDate(depositDate));
        return "depositByDate";
    }


//    Add working

    @GetMapping("/add")
    public String addEntry(Model model){
        bankDeposits bd = new bankDeposits();
        model.addAttribute("newBankDeposits",bd);
        return "depositAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newBankDeposits") bankDeposits bd, BindingResult result, Model model){
            bankDepositsDao.addEntry(bd);
            return "redirect:/bankDeposits/";

    }


//    Update Working

    @GetMapping("/update")
    public String updateBD(Model model){
        bankDeposits bd = new bankDeposits();
        model.addAttribute("newBankDeposits",bd);
        return "depositUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newBankDeposits") bankDeposits bd, BindingResult result, Model model){
        bankDepositsDao.updateEntry(bd);
        return "redirect:/bankDeposits/";

    }

}


















