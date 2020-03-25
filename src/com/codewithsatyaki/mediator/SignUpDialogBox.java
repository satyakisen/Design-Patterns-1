package com.codewithsatyaki.mediator;

public class SignUpDialogBox {
    private TextBox username = new TextBox();
    private TextBox password = new TextBox();
    private Button signUp = new Button();
    private Checkbox checkbox= new Checkbox();

    public SignUpDialogBox() {
        username.addEventHandlers(this::signUpFormChanged);
        password.addEventHandlers(this::signUpFormChanged);
        checkbox.addEventHandlers(this::signUpFormChanged);
    }

    public void uiSimulation() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signUp.isEnabled());

        // The user enters their username, the button is still disabled
        username.setContent("username");
        System.out.println("After setting the username: " + signUp.isEnabled());

        // The user enters their password, the button is still disabled
        password.setContent("password");
        System.out.println("After setting the password: " + signUp.isEnabled());

        // The agrees to the terms, the button becomes enabled
        checkbox.setEnabled(true);
        System.out.println("After agreeing to terms: " + checkbox.isEnabled());

        // The user removes the password, the button becomes disabled
        password.setContent("");
        System.out.println("After removing the password: " + signUp.isEnabled());

        // The user enters the password again, the button becomes enabled
        password.setContent("password");
        System.out.println("After re-setting the password: " + signUp.isEnabled());
    }

    private void signUpFormChanged() {
        var usernameContent = username.getContent();
        var passwordContent = password.getContent();
        var isValid = (usernameContent == null || usernameContent.isEmpty()) || (passwordContent == null || passwordContent.isEmpty()) ||
                !checkbox.isEnabled();
        signUp.setEnabled(!isValid);
    }
}
