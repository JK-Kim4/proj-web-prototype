package com.jw.webprototype.presentation;

import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;

import java.util.List;

public class MemoryItemRepository implements ItemRepository{

    @Override
    public Long save(ItemSaveDto dto) {
        return null;
    }

    @Override
    public int delete(Long itemId) {
        return 0;
    }

    @Override
    public int update(ItemSaveDto dto) {
        return 0;
    }

    @Override
    public Item findById(Long itemId) {
        return null;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }
}
