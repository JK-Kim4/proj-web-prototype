package com.jw.webprototype.domain;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.ItemSaveDto;

public class Item extends BaseTime{

    public Item(){
        super();

    }

    public Item(ItemSaveDto dto){
        this.id = Application.itemId++;
        this.title = dto.getTitle();
        this.description = dto.getDescription();
        this.thumbnailFileName = dto.getThumbnailFileName();
        this.ThumbnailFilePath = dto.getThumbnailFilePath();
    }

    private Long id;

    private String title;

    private String description;

    private String thumbnailFileName;

    private String ThumbnailFilePath;

    public Long getId() {
        return id;
    }

    public void setId(){
        this.id = Application.itemId++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getThumbnailFileName() {
        return thumbnailFileName;
    }

    public void setThumbnailFileName(String thumbnailFileName) {
        this.thumbnailFileName = thumbnailFileName;
    }

    public String getThumbnailFilePath() {
        return ThumbnailFilePath;
    }

    public void setThumbnailFilePath(String thumbnailFilePath) {
        ThumbnailFilePath = thumbnailFilePath;
    }
}
