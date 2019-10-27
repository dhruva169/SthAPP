package com.macd.sth.controllers;


import com.macd.sth.dao.VehicleDao;
import com.macd.sth.models.vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/vehicle")
@Controller
public class VehicleController {


    @Autowired
    VehicleDao vehicleDao;


    @RequestMapping("")
    public String base(){
        return "vehicleBase";
    }

    @RequestMapping("/all")
    public String allVehicle(Model model){
        model.addAttribute("allVehicle", vehicleDao.getAllVehicles());
        return "vehicleAll";
    }

    @GetMapping("/{vehicleNo}")
    public String vehicleByVehicleNo(Model model, @PathVariable("vehicleNo") String vehicleNo ){
        model.addAttribute("vehicle", vehicleDao.getVehicleByVehicleNo(vehicleNo));
        return "vehicleByVehicleNo";
    }

    @RequestMapping("/delete/{vehicleNo}")
    public String delBD(Model model, @PathVariable("vehicleNo") String apple){
        vehicleDao.removeVehicle(apple);
        return "redirect:/vehicle/";
    }

    @GetMapping("/add")
    public String addEntry(Model model){
        vehicle bd = new vehicle();
        model.addAttribute("newVehicle",bd);
        return "vehicleAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newVehicle") vehicle bd, BindingResult result, Model model){
        vehicleDao.addVehicle(bd);
        return "redirect:/vehicle/";

    }

    @GetMapping("/update")
    public String updateBD(Model model){
        vehicle bd = new vehicle();
        model.addAttribute("newTodo",bd);
        return "vehicleUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newTodo") vehicle bd, BindingResult result, Model model){
        vehicleDao.updateVehicle(bd);
        return "redirect:/vehicle/";

    }


}
