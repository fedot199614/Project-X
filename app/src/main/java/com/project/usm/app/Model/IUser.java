package com.project.usm.app.Model;

public interface IUser {
    String getEmail();
    String getPassword();
    boolean isValidData();
    String getToken();
    int getId();
}
