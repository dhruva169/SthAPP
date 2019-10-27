package com.macd.sth.controllers;


import com.macd.sth.dao.ToDoDao;
import com.macd.sth.models.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/todo")
public class ToDoController {


    @Autowired
    ToDoDao toDoDao;


    @RequestMapping("")
    public String baseTodo(){
        return "todoBase";
    }

//    Working

    @RequestMapping("/all")
    public String allTodo(Model model){
        model.addAttribute("alltodo", toDoDao.getAllTasks());
        return "todoAll";
    }

    @GetMapping("/{taskID}")
    public String taskByID(Model model, @PathVariable("taskID") int id ){
        model.addAttribute("todo", toDoDao.getTask(id));
        return "todoByID";
    }

//    @RequestMapping("/delete/{taskID}")
//    public String delBD(Model model, @PathVariable("taskID") int id){
//        toDoDao.deleteTask(id);
//        return "redirect:/todo/";
//    }

    //    Working

    @GetMapping("/add")
    public String addEntry(Model model){
        todo bd = new todo();
        model.addAttribute("newTodo",bd);
        return "todoAdd";
    }

    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute("newTodo") todo bd, BindingResult result, Model model){
        toDoDao.addTask(bd);
        return "redirect:/todo/";

    }

    //    Working

    @GetMapping("/update")
    public String updateBD(Model model){
        todo bd = new todo();
        model.addAttribute("newTodo",bd);
        return "todoUpdate";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("newTodo") todo bd, BindingResult result, Model model){
        toDoDao.updateTask(bd);
        return "redirect:/todo/";

    }

}
