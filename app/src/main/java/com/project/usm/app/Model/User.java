package com.project.usm.app.Model;

import android.text.TextUtils;
import android.util.Patterns;
import android.util.Printer;

public class User implements IUser {

    private String email;
    private String password;
    private String token;
    private String name;
    private String lastName;
    private String phone;
    private int id;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return this.email;
    }


    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean validationPhone() {
        return false;
    }

    @Override
    public boolean isValidData() {
        //Data Validation
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length()>6;
    }


    public String getToken() {
        return this.token;
    }


    public int getId() {
        return this.id;
    }
}
