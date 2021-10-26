package GUI.AbstractClasses;

import javax.swing.*;

public abstract class Frames extends JFrame {

    public Frames(String title) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle(title);
    }

    public Frames (String title, int width, int height) {
        this(title);
        this.setSize(width, height);
    }
}
