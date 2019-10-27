package com.macd.sth.controllers;


import com.macd.sth.dao.LocationDao;
import com.macd.sth.models.location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/location")
@Controller
public class LocationController {

    @Autowired
    LocationDao locationDao;

    @RequestMapping("")
    public String baseLocation(){
        return "locationBase";
    }

    @RequestMapping("/all")
    public String allLocation(Model model){
        model.addAttribute("allLocation", locationDao.getAllLocations());
        return "locationAll";
    }

    @GetMapping("/{modelNo}")
    public String depositByDate(Model model, @PathVariable("modelNO") String modelNO ){
        model.addAttribute("location", locationDao.getLocationByModelNo(modelNO));
        return "locationByModelNo";
    }

//    @RequestMapping("/delete/{modelNo}")
//    public String delBD(Model model, @PathVariable("modelNO") String modelNo){
//        locationDao.deleteLocationByModelNo(modelNo);
//        return "redirect:/location/";
//    }

    @GetMapping("/add")
    public String addEntry(Model model){
        location bd = new location();
        model.addAttribute("newLocation",bd);
        return "locationAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newLocation") location bd, BindingResult result, Model model){
        locationDao.insertLocationByModelNo(bd);
        return "redirect:/location/";

    }

    @GetMapping("/update")
    public String updateBD(Model model){
        location bd = new location();
        model.addAttribute("newLocation",bd);
        return "locationUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newLocation") location bd, BindingResult result, Model model){
        locationDao.updateLocationByModelNo(bd);
        return "redirect:/location/";

    }


}
