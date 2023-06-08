package com.jw.webprototype.service;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.ItemSaveDto;
import com.jw.webprototype.domain.Item;
import com.jw.webprototype.presentation.ItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class ItemService {

    private final Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public Long save(ItemSaveDto dto, MultipartFile file) throws IOException {
        Item item = new Item(dto);

        if(!file.isEmpty()){
            logger.info("첨부 파일이 존재합니다.");
            logger.info("ITEM SAVE -> FILE UPLOAD [START]");
            String fullFilePath = Application.ROOT_PATH + Application.FILE_UPLOAD_PATH + file.getOriginalFilename();
            file.transferTo(new File(fullFilePath));

            item.setThumbnailFileName(file.getOriginalFilename());
            item.setThumbnailFilePath(fullFilePath);
            logger.info("ITEM SAVE -> FILE UPLOAD [END]");
        }
        return itemRepository.save(item);
    }

    public List<Item> findAll(){
        return itemRepository.findAll();
    }

    public Item findItemById(Long itemId){
        return itemRepository.findById(itemId);
    }
}
