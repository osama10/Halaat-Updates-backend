package com.vend.halaatupdate.halaatupdtae.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name ;

    @Column(name = "password")
    private String password ;

    @Column(name = "email")
    private String email ;

    @Column(name = "occupation")
    private String occupation ;

    @OneToMany(mappedBy = "user")
    @JsonBackReference
    private List<UpdateModel> updates;

    public UserModel() {
    }

    public UserModel(String name, String password, String email , String occupation) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}