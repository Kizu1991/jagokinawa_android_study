package com.src.event.models.eventon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.src.event.models.Model;

public class Ticket implements Model {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket withName(String name) {
        this.name = name;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Ticket withPrice(String price) {
        this.price = price;
        return this;
    }
}
