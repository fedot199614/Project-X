package com.project.usm.app.Presenter;

import com.project.usm.app.View.Auth_View;

public class Auth_Presenter implements IAuth_Presenter {

    Auth_View auth_view;
    public void Auth_Presenter(Auth_View authView){
        this.auth_view = authView;
    }


    @Override
    public void onLogin(String email, String pass) {

    }

    @Override
    public void registration(String name, String lastName, String email, String pass, String mobile) {

    }

    @Override
    public void forgotPass(String email) {

    }

    @Override
    public void checkedWebServicesConnection() {

    }

    @Override
    public void connectToWS() {

    }


}