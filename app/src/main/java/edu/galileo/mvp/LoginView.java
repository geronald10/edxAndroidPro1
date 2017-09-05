package edu.galileo.mvp;

/**
 * Created by Goronald on 06-Sep-17.
 */

public interface LoginView {

    void showProgress(boolean showProgress);

    void setUsernameError(int messageResId);

    void setPasswordError(int messageResId);

    void successAction();

}
