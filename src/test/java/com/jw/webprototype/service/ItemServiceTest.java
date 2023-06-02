package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.ItemSaveDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
