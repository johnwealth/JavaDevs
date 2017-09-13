package com.graduate.javadevs.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by user on 2017-09-10.
 */
public class ItemResponse {

    @SerializedName("items")
    @Expose
    private List<Item> Items;

    public List<Item>getItems(){

        return Items = Items;
    }

    private void setItems(List<Item>items){

        this.Items = items;
    }

}
