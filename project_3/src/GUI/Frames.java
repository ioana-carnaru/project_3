package GUI;

import javax.swing.*;

public abstract class Frames extends JFrame {

    public static Frames frame;

    public Frames() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
