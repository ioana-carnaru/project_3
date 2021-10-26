package GUI.firstWindow;

import GUI.Frames;

public class FirstFrame extends Frames {

    public static FirstFrame frame;

    public FirstFrame() {
        super();

        this.setTitle("Inventory Management");
        this.setSize(300, 300);
        this.setVisible(true);
    }
}
