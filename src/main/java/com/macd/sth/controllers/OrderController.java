package com.macd.sth.controllers;


import com.macd.sth.dao.InventoryDao;
import com.macd.sth.dao.OrderDao;
import com.macd.sth.dao.TyreDao;
import com.macd.sth.models.inventory;
import com.macd.sth.models.order;
import com.macd.sth.models.tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/order")
@Controller
public class OrderController {

    @Autowired
    OrderDao orderDao;

    @Autowired
    TyreDao tyreDao;

    @Autowired
    InventoryDao inventoryDao;

    @GetMapping("")
    public String base(){
        return "orderBase";
    }

    @GetMapping("/{modelNo}")
    public String orderTyre(@PathVariable(value = "modelNo") String modelNo, Model model){
//            tyre tyre = tyreDao.getTyreDetails(modelNo);
        inventory inv = inventoryDao.getStockByModelNo(modelNo);
            model.addAttribute("inventory", inv);
            model.addAttribute("placeOrder", new order());
            return "orderTyre";
    }

    @PostMapping("/{modelNo}")
    public String orderProcess(@Valid @ModelAttribute("placeOrder") order m,@PathVariable(value="modelNo") String modelNo, BindingResult result, Model model){
        tyre tyre = tyreDao.getTyreDetails(m.getModelNo());
        inventory inve = inventoryDao.getStockByModelNo(modelNo);
        if(inve.getQuantity()<m.getQuantity()){
            model.addAttribute("error", "Not Enough in Stocks");
            inventory inv = inventoryDao.getStockByModelNo(m.getModelNo());
            model.addAttribute("inventory", inv);
            return "orderTyre";
        }
        orderDao.orderTyre(m.getOverheadCharges(),m.getPaymentMode(), m.getStatus(), m.getCustID(), modelNo, m.getQuantity());

        return "redirect:/order";
    }


//    int overHeadCharges, String paymentMode, String Status, int custID, String modelNo, int quantity





//    @GetMapping("/{modelNo}/{quantity}")
//    public String orderTyreProcess(@PathVariable(value = "modelNo") String modelNo, @PathVariable(value = "quantity") int quantity, Model model){
////        tyre tyre = tyreDao.getTyreDetails(modelNo);
//        inventory inve = inventoryDao.getStockByModelNo(modelNo);
//        if(inve.getQuantity()<quantity){
//            model.addAttribute("error", "Not Enough in Stocks");
//            inventory inv = inventoryDao.getStockByModelNo(modelNo);
//            model.addAttribute("inventory", inv);
//            return "orderTyre";
//        }
//
//        order or = orderDao.getDetails(modelNo);
//        System.out.println(or.getCustID());
//        orderDao.orderTyre(or.getOverheadCharges(),or.getPaymentMode(),or.getStatus(),or.getCustID(),modelNo,quantity);
//        return "redirect:/tyre";
//    }


}

//    void orderTyre(int overHeadCharges, String paymentMode, String Status, int custID, String modelNo, int quantity);
