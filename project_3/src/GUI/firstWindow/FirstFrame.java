package GUI.firstWindow;

import GUI.AbstractClasses.Frames;

import java.awt.*;

public class FirstFrame extends Frames {

    private static FirstFrame frame;

    SignInButton button;

    private FirstFrame() {
        super("Inventory Management", 400, 400);
        this.setLayout(new FlowLayout());

        button = new SignInButton("Sign In");

        this.add(button);

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
