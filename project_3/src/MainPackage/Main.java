package MainPackage;

import GUI.firstWindow.FirstFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Runnable guiRunnable = new Runnable() {
            @Override
            public void run() {
                FirstFrame.getFrame();
            }
        };

        SwingUtilities.invokeLater(guiRunnable);
    }
}
