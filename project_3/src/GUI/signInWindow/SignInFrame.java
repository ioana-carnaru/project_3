package GUI.signInWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;

public class SignInFrame extends Frames {

    public static SignInFrame signInFrame;

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    SubmitSignInButton submitSignInButton;
    BackButton backButton;


    private SignInFrame () {
        super("Log to an existing account", 300, 300);
        this.setLayout(new GridLayout(7, 1, 0, 5));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        submitSignInButton = new SubmitSignInButton("Submit");
        backButton = new BackButton("Back");

        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(submitSignInButton);
        this.add(backButton);

        this.setVisible(true);
    }

    public static SignInFrame getFrame () {
        if (signInFrame == null)
            signInFrame = new SignInFrame();

        return signInFrame;
    }

    public static void disposeFrame () {
        signInFrame.dispose();
        signInFrame = null;
    }

}
