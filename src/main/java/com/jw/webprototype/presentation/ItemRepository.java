package com.jw.webprototype.presentation;

import com.jw.webprototype.domain.Item;

import java.util.List;

public interface ItemRepository {

    Long save(Item dto);

    int delete(Long itemId);

    int update(Item item);

    Item findById(Long itemId);

    List<Item> findAll();
}
