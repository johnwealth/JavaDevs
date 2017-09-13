package com.graduate.javadevs.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 2017-09-10.
 */
public class Item {
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("avatar")
    @Expose
    private String avatarUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    public Item(String login, String avatarUrl, String htmUrl){

        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmUrl;
    }

    public String getLogin(){

        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getAvatarUrl(){

        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }


    public String getHtmlUrl(){

        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl){
        this.htmlUrl = htmlUrl;
    }
}
