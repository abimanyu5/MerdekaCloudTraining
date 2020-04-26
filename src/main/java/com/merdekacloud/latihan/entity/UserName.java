package com.merdekacloud.latihan.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UserName {

    @Size(min = 3,max = 50,message = "3-50 characters")
    private String Name;
    private String Address;

    @Email(message = "invalid email")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
