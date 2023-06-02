package com.jw.webprototype.controller;

import com.jw.webprototype.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    private final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping("/list")
    public String listPage(){
        return "contents/item/list";
    }

    @GetMapping("/insert")
    public String insertPage(){
        return "contents/item/insert";
    }

}
