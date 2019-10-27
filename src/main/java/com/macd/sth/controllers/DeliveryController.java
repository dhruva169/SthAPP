package com.macd.sth.controllers;


import com.macd.sth.dao.DeliveryDao;
import com.macd.sth.models.delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    DeliveryDao deliveryDao;

    @RequestMapping("")
    public String baseDeposit(){
        return "deliveryBase";
    }

    @RequestMapping("/byDate/{date}")
    public String byDate(Model model, @PathVariable("date") String date){
        model.addAttribute("allDelivery", deliveryDao.getAllDeliveryByDateOfDelivery(date));
        return "deliveryByDate";
    }

//  All working

    @RequestMapping("/all")
    public String allDeposits(Model model){
        model.addAttribute("allDelivery", deliveryDao.getAllDelivery());
        return "deliveryAll";
    }

    @GetMapping("/{id}")
    public String depositByDate(Model model, @PathVariable("id") int deliveryID ){
        model.addAttribute("delivery", deliveryDao.getDeliveryDetails(deliveryID));
        return "deliveryByID";
    }

//    @RequestMapping("/delete/{id}")
//    public String delBD(Model model, @PathVariable("id") int deliveryID){
//        deliveryDao.deleteEntry(deliveryID);
//        return "redirect:/delivery/all";
//    }

//  Add Working

    @GetMapping("/add")
    public String addEntry(Model model){
        delivery bd = new delivery();
        model.addAttribute("newDelivery",bd);
        return "deliveryAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newDelivery") delivery bd, BindingResult result, Model model){
        deliveryDao.addEntry(bd);
        return "redirect:/delivery/all";
    }

//  Update Working

    @GetMapping("/update")
    public String updateBD(Model model){
        delivery bd = new delivery();
        model.addAttribute("newBankDeposits",bd);
        return "deliveryUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newBankDeposits") delivery bd, BindingResult result, Model model){
        deliveryDao.updateEntry(bd);
        return "redirect:/bankDeposits/";

    }




}
