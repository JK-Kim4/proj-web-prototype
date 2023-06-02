package com.jw.webprototype.domain;

import com.jw.webprototype.Application;
import com.jw.webprototype.controller.dto.ItemSaveDto;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", thumbnailFileName='" + thumbnailFileName + '\'' +
                ", ThumbnailFilePath='" + ThumbnailFilePath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item item)) return false;
        return Objects.equals(getId(), item.getId()) && Objects.equals(getTitle(), item.getTitle()) && Objects.equals(getDescription(), item.getDescription()) && Objects.equals(getThumbnailFileName(), item.getThumbnailFileName()) && Objects.equals(getThumbnailFilePath(), item.getThumbnailFilePath());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getThumbnailFileName(), getThumbnailFilePath());
    }
}
