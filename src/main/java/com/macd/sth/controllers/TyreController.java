package com.macd.sth.controllers;


import com.macd.sth.dao.TyreDao;
import com.macd.sth.models.tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/tyre")
public class TyreController {


    @Autowired
    TyreDao tyreDao;


    @RequestMapping("")
    public String tyreBase(){
        return "tyreBase";
    }

    @RequestMapping("/all")
    public String allTyre(Model model){
        model.addAttribute("allTyre", tyreDao.getAllTyre());
        return "tyreAll";
    }

    @GetMapping("/{modelNO}")
    public String tyreByModelNo(Model model, @PathVariable("modelNO") String modelNO ){
        model.addAttribute("tyre", tyreDao.getTyreDetails(modelNO));
        return "tyreByModelNo";
    }

    @RequestMapping("/delete/{modelNO}")
    public String delBD(Model model, @PathVariable("modelNO") String apple){
        tyreDao.deleteTyre(apple);
        return "redirect:/tyre/";
    }

    @GetMapping("/add")
    public String addEntry(Model model){
        tyre bd = new tyre();
        model.addAttribute("newTyre",bd);
        return "tyreAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newTyre") tyre bd, BindingResult result, Model model){
        tyreDao.addTyre(bd);
        return "redirect:/tyre/";

    }

    @GetMapping("/update")
    public String updateBD(Model model){
        tyre bd = new tyre();
        model.addAttribute("newSupplier",bd);
        return "tyreUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newSupplier") tyre bd, BindingResult result, Model model){
        tyreDao.updateTyre(bd);
        return "redirect:/tyre/";

    }


}
