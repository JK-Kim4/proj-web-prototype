package com.jw.webprototype.service;

import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;
import com.jw.webprototype.presentation.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public Long save(ItemSaveDto dto){
        Item item = new Item(dto);
        return itemRepository.save(item);
    }
}
