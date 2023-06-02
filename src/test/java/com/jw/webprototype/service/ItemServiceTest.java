package com.jw.webprototype.service;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ItemServiceTest {

    @Autowired
    ItemService itemService;

    @Test
    public void item_save_test(){
        //given
        String title = "item";
        String description = "description";

        ItemSaveDto item1 = new ItemSaveDto();
        item1.setTitle(title);
        item1.setDescription(description);

        //when
        Long result = itemService.save(item1);

        //then
        System.out.println("item save result = " + result);
    }

    @Test
    public void item_find_all_test(){
        item_save_test();
        item_save_test();

        List<Item> itemList = itemService.findAll();

        itemList.stream().forEach(System.out::println);
    }

    @Test
    public void item_find_byid_test(){
        item_save_test();

        Item result = itemService.findItemById(Application.itemId-1);

        System.out.println(result.toString());
    }
}
