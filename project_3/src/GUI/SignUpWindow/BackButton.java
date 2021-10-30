package GUI.SignUpWindow;

import GUI.AbstractClasses.Buttons;
import GUI.firstWindow.FirstFrame;

import java.awt.event.ActionEvent;

class BackButton extends Buttons { // go back from SIGN UP frame to first frame

    BackButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SignUpFrame.disposeFrame();
        FirstFrame.getFrame();
    }
}
