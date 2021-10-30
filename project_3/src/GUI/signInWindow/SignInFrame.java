package GUI.signInWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;

public class SignInFrame extends Frames {

    private static SignInFrame frame;

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    SubmitSignInButton submitSignInButton;


    private SignInFrame () {
        super("Log to an existing account", 300, 300);
        this.setLayout(new GridLayout(7, 1));

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

    public static SignInFrame getFrame () {
        if (frame == null)
            frame = new SignInFrame();

        return frame;
    }

    public static void disposeFrame () {
        frame.dispose();
        frame = null;
    }
}
