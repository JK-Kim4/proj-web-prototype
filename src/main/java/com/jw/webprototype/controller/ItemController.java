package com.jw.webprototype.controller;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;
import com.jw.webprototype.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {

    private final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private final ItemService itemService;

    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @GetMapping("/list")
    public String listPage(Model model){
        model.addAttribute("items", itemService.findAll());
        return "contents/item/list";
    }

    @GetMapping("/insert")
    public String insertPage(){
        return "contents/item/insert";
    }

    @GetMapping("/detail/{itemId}")
    public String detailPage(
            @PathVariable(name = "itemId") Long itemId,
            Model model){
        model.addAttribute("item", itemService.findItemById(itemId));
        return "contents/item/detail";
    }

    @GetMapping("/items")
    @ResponseBody
    public List<Item> findAll(){
        return itemService.findAll();
    }

    @GetMapping("/{itemId}")
    @ResponseBody
    public Item findById(
            @PathVariable(name = "itemId") Long itemId){
        return itemService.findItemById(itemId);
    }

    @PostMapping("/insert")
    public ResponseEntity<Object> insertMethod(
            ItemSaveDto dto,
            MultipartFile file) throws IOException {

        HttpHeaders headers = new HttpHeaders();

        headers.setLocation(URI.create("/item/list"));
        itemService.save(dto, file);
        return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
    }

}
