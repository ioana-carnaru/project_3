package MainPackage;

import GUI.GUIThread;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUIThread guiThread = new GUIThread();

        SwingUtilities.invokeLater(guiThread);
    }
}
