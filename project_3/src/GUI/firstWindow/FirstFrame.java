package GUI.firstWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends Frames {

    private static FirstFrame frame;

    JPanel panel;
    JLabel welcomeLabel;
    JLabel descriptionLabel;
    SignInButton signInButton;
    SignUpButton signUpButton;
    JLabel outroLabel;

    private FirstFrame() {
        super("Inventory Management", 400, 400);

        panel = new JPanel();
        welcomeLabel = new JLabel("Inventory Management");
        descriptionLabel = new JLabel("We keep track of all items!");
        signInButton = new SignInButton("Sign In");
        signUpButton = new SignUpButton("Sign up");
        outroLabel = new JLabel("It is simple, just create an account and save your items!");

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        outroLabel.setFont(new Font("Arial", Font.PLAIN, 15));


        //panel.setAlignmentX(JComponent.CENTER_ALIGNMENT); // doesn't work, WHY?

        panel.add(welcomeLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(descriptionLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(signInButton);
        panel.add(Box.createRigidArea(new Dimension(0, 5)));
        panel.add(signUpButton);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        panel.add(outroLabel);

        //panel.setAlignmentX(JComponent.CENTER_ALIGNMENT); // doesn't work here either...


        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    public static FirstFrame getFrame () {
        if (frame == null)
            frame = new FirstFrame();

        return frame;
    }

    public static void disposeFrame () {
        frame.dispose();
        frame = null;
    }
}
