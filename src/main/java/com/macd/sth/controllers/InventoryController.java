package com.macd.sth.controllers;


import com.macd.sth.dao.InventoryDao;
import com.macd.sth.models.inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/inventory")
@Controller
public class InventoryController {


    @Autowired
    InventoryDao inventoryDao;

    @RequestMapping("")
    public String baseInventory(){
        return "inventoryBase";
    }

    @RequestMapping("/all")
    public String allInventory(Model model){
        model.addAttribute("allInventory", inventoryDao.getCompleteInventory());
        return "inventoryAll";
    }

    @GetMapping("/byModelNo/{modelNo}")
    public String inventoryByModelNo(Model model, @PathVariable("modelNo") String modelNo ){
        model.addAttribute("inventory", inventoryDao.getParticularInventory(modelNo));
        return "inventoryByModelNo";
    }

//    @RequestMapping("/delete/{modelNo}")
//    public String delBD(Model model, @PathVariable("modelNo") String modelNo){
//        inventoryDao.deleteEntry(modelNo);
//        return "redirect:/inventory/";
//    }

    @GetMapping("/add")
    public String addEntry(Model model){
        inventory bd = new inventory();
        model.addAttribute("newInventory",bd);
        return "inventoryAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newInventory") inventory bd, BindingResult result, Model model){
        inventoryDao.addEntry(bd);
        return "redirect:/inventory/";

    }

    @GetMapping("/update")
    public String updateBD(Model model){
        inventory bd = new inventory();
        model.addAttribute("newInventory",bd);
        return "inventoryUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newInventory") inventory bd, BindingResult result, Model model){
        inventoryDao.updateEntry(bd);
        return "redirect:/inventory/";

    }


}
