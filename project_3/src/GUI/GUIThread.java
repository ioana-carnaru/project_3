package GUI;

import GUI.firstWindow.FirstFrame;

public class GUIThread implements Runnable{
    @Override
    public void run() {
        FirstFrame.getFrame();
    }
}
