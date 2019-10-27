package com.macd.sth.controllers;


import com.macd.sth.dao.EmployeeDao;
import com.macd.sth.models.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/employee")
@Controller
public class EmployeeController {


    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("")
    public String base(){
        return "employeeBase";
    }

//    working

    @RequestMapping("/all")
    public String allEmployees(Model model){
        model.addAttribute("allEmployees", employeeDao.getAllEmployees());
        return "employeeAll";
    }

    @GetMapping("/{id}")
    public String employeeById(Model model, @PathVariable("id") int empID ){
        model.addAttribute("allEmployees", employeeDao.getEmployeeDetails(empID));
        return "employeeById";
    }

//    @RequestMapping("/delete/{id}")
//    public String delEmpl(Model model, @PathVariable("id") int empID){
//        employeeDao.deleteEmployee(empID);
//        return "redirect:/employee/";
//    }

//    working

    @GetMapping("/add")
    public String addEntry(Model model){
        employee employee = new employee();
//        boolean a = employeeDao.employeeExists(employee.getEmpID());
//
//        if(a==true){
//            model.addAttribute("userExists", a);
//            return "registration";
//        }
//        else{
//            model.addAttribute("newEmployee",employee);
//            return "registration";
//        }
        return "redirect:/registration";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newEmployee") employee employee, BindingResult result, Model model){
        if(result.hasErrors()){
            return "registration";
        }
        else {
            employeeDao.addEmployee(employee);
            return "redirect:/employee/";
        }
    }

//    Working

    @GetMapping("/update")
    public String updateBD(Model model){
        employee bd = new employee();
        model.addAttribute("newEmployee",bd);
        return "employeeUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newEmployee") employee bd, BindingResult result, Model model){
        employeeDao.updateEmployee(bd);
        return "redirect:/employee/";

    }


}
