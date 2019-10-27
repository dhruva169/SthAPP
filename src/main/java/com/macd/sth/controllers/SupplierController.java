package com.macd.sth.controllers;


import com.macd.sth.dao.SupplierDao;
import com.macd.sth.models.supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/supplier")
@Controller
public class SupplierController {

    @Autowired
    SupplierDao supplierDao;

    @RequestMapping("")
    public String baseSupplier(){
        return "supplierBase";
    }

//    working

    @RequestMapping("/all")
    public String allDeposits(Model model){
        model.addAttribute("allSupplier", supplierDao.getAllSupplier());
        return "supplierAll";
    }

    @GetMapping("/{suppID}")
    public String depositByDate(Model model, @PathVariable("suppID") int suppID ){
        model.addAttribute("supplier", supplierDao.getSupplierDetails(suppID));
        return "suppilerByID";
    }

//    @RequestMapping("/delete/{suppID}")
//    public String delBD(Model model, @PathVariable("suppID") int suppID){
//        supplierDao.deleteSupplier(suppID);
//        return "redirect:/supplier/";
//    }

//    Working

    @GetMapping("/add")
    public String addEntry(Model model){
        supplier bd = new supplier();
        model.addAttribute("newSupplier",bd);
        return "supplierAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newSupplier") supplier bd, BindingResult result, Model model){
        supplierDao.addSupplier(bd);
        return "redirect:/supplier/";

    }

//    working

    @GetMapping("/update")
    public String updateBD(Model model){
        supplier bd = new supplier();
        model.addAttribute("newSupplier",bd);
        return "supplierUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newSupplier") supplier bd, BindingResult result, Model model){
        supplierDao.updateSupplier(bd);
        return "redirect:/supplier/";

    }



}
