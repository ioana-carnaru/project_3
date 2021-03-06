package GUI.firstWindow;

import GUI.AbstractClasses.Buttons;
import GUI.signInWindow.SignInFrame;

import java.awt.event.ActionEvent;

public class SignInButton extends Buttons {

    public SignInButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FirstFrame.disposeFrame();
        SignInFrame.getFrame();
    }
}
