package com.jw.webprototype.presentation;

import com.jw.webprototype.domain.Item;
import com.jw.webprototype.exception.PKDuplicationException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MemoryItemRepository implements ItemRepository{

    private List<Item> itemList = new ArrayList<>();

    @Override
    public Long save(Item item) {

        //Null && PKDuplication check
        if(Objects.isNull(item)){
            throw new NullPointerException("Item Object is null!");
        }else{
            if(itemList.stream()
                    .filter(i -> i.getId().equals(item.getId()))
                    .findAny()
                    .isPresent()){
                throw new PKDuplicationException("Item Unique Key value is duplicated");
            }else{
                //save
                itemList.add(item);
                return item.getId();
            }
        }
    }

    @Override
    public int delete(Long itemId) {
        return 0;
    }

    @Override
    public int update(Item item) {
        return 0;
    }

    @Override
    public Item findById(Long itemId) {
        return itemList.stream()
                .filter(i -> i.getId().equals(itemId))
                .findAny()
                .orElseThrow(() -> new NullPointerException("아이템 조회에 실패하였습니다. ItemId = " +itemId));
    }

    @Override
    public List<Item> findAll() {
        return this.itemList;
    }
}
