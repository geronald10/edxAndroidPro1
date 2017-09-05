package edu.galileo.mvp;

/**
 * Created by Goronald on 06-Sep-17.
 */

public interface LoginModel {

    interface OnLoginFinishedListener {

        void onCanceled();

        void onPasswordError();

        void onSuccess();

    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
