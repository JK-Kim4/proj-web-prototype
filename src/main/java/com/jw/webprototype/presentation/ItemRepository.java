package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;

import java.util.List;

public interface ItemRepository {

    Long save(ItemSaveDto dto);

    int delete(Long itemId);

    int update(ItemSaveDto dto);

    Item findById(Long itemId);

    List<Item> findAll();
}
