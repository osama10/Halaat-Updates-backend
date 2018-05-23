package com.vend.halaatupdate.halaatupdtae.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "updates")
public class UpdateModel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private  String description;

    @Column(name =  "image")
    private  String image;

    @Column(name = "date")
    private  String date;

    @Column(name = "user_id")
    private int user_id;

    @ManyToOne
    @JoinColumn(name="user_id" , insertable=false, updatable=false)
    @JsonBackReference
    private  UserModel user;

    public UpdateModel() {
    }

    public UpdateModel(String title, String description, String image, String date, int user_id) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.date = date;
        this.user_id = user_id;
    }

    public UpdateModel(String title, String description, String image, String date, UserModel user) {
        this.title = title;
        this.description = description;
        this.image = image;
        this.date = date;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
