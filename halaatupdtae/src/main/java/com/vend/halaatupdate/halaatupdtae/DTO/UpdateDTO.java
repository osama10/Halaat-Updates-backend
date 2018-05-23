package com.vend.halaatupdate.halaatupdtae.DTO;

import com.vend.halaatupdate.halaatupdtae.Entity.UserModel;

import javax.validation.constraints.NotNull;

public class UpdateDTO {

    @NotNull
    private  String title;

    @NotNull
    private  String description;

    @NotNull
    private  String image;

    @NotNull
    private  String date;

    @NotNull
    private int userId;

    public UpdateDTO() {
    }

    public UpdateDTO(String title, String description, String image, String date, int userId) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.date = date;
        this.userId = userId;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
