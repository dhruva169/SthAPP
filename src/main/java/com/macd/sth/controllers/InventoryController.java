package com.macd.sth.controllers;

import com.macd.sth.dao.InventoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryDao inventoryDao;





}
