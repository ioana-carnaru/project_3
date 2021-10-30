package GUI.SignUpWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;

public class SignUpFrame extends Frames {

    private static SignUpFrame frame;

    JLabel usernameLabel;
    JTextField usernameField;
    JLabel passwordLabel;
    JPasswordField passwordField;
    SubmitSignUpButton submitSignUpButton;

    private SignUpFrame () {
        super("Create new account", 300, 300);
        this.setLayout(new GridLayout(7, 1));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        submitSignUpButton = new SubmitSignUpButton("Submit");

        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(submitSignUpButton);

        this.setVisible(true);
    }

    public static SignUpFrame getFrame () {
        if (frame == null)
            frame = new SignUpFrame();

        return frame;
    }

    public static void disposeFrame () {
        frame.dispose();
        frame = null;
    }
}
