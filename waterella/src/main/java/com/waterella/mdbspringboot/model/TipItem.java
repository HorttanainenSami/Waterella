package com.waterella.mdbspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TipItem")
public class TipItem {

    @Id
    private String name;

    private String category;
    private String description;

    public TipItem(String name, String category, String description) {
        super();
        this.name = name;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemDescription() {
        return description;
    }

    public void setItemDescription(String description) {
        this.description = description;
    }

    public String getItemCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
