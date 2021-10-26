package GUI.firstWindow;

import GUI.AbstractClasses.Frames;

import java.awt.*;

public class FirstFrame extends Frames {

    public static FirstFrame frame;

    SignInButton button;


    public FirstFrame() {
        super("Inventory Management", 400, 400);
        this.setLayout(new FlowLayout());

        button = new SignInButton("Sign In");

        this.add(button);

        this.setVisible(true);
    }
}
