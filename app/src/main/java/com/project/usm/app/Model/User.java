package com.project.usm.app.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    private String email, password,token;
    private int id;

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isValidData() {
        //Data Validation
        return !TextUtils.isEmpty(getEmail()) && Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() && getPassword().length()>6;
    }

    @Override
    public String getToken() {
        return this.token;
    }

    @Override
    public int getId() {
        return this.id;
    }
}
