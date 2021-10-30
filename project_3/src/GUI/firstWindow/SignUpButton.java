package GUI.firstWindow;

import GUI.AbstractClasses.Buttons;
import GUI.SignUpWindow.SignUpFrame;

import java.awt.event.ActionEvent;

public class SignUpButton extends Buttons {

    public SignUpButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FirstFrame.disposeFrame();
        SignUpFrame.getFrame();
    }
}
