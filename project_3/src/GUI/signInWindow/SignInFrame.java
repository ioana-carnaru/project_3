package GUI.signInWindow;

import GUI.AbstractClasses.Buttons;
import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;

public class SignInFrame extends Frames {

    public static SignInFrame frame;

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    SubmitSignInButton submitSignInButton;


    public SignInFrame () {
        super("Sign In", 300, 300);
        this.setLayout(new GridLayout(10, 1));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        submitSignInButton = new SubmitSignInButton("Submit");

        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(submitSignInButton);

        this.setVisible(true);
    }
}
