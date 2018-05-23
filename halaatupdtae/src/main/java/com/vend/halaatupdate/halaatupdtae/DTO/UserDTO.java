package com.vend.halaatupdate.halaatupdtae.DTO;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDTO {
    @NotNull
    @Size(max = 100)
    private String name ;

    @NotNull
    private String password ;

    @NotNull
    private String email ;

    @NotNull
    private  String occupation ;

    public UserDTO() {
    }

    public UserDTO(String name, String password, String email , String occupation ) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.occupation = occupation;
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
