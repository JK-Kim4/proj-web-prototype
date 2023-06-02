package com.jw.webprototype.domain;

import java.time.LocalDate;

public class BaseTime {

    public BaseTime(){
        this.createdDate = LocalDate.now();
        this.modifiedDate = LocalDate.now();
    }

    private LocalDate createdDate;

    private LocalDate modifiedDate;

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getModifiedDate() {
        return modifiedDate;
    }

    public void setCreatedDateToNow(){
        this.createdDate = LocalDate.now();
    }

    public void setModifiedDateToNow(){
        this.modifiedDate = LocalDate.now();
    }
}
