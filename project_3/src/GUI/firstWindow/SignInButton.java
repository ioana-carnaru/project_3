package GUI.firstWindow;

import GUI.AbstractClasses.Buttons;
import GUI.signInWindow.SignInFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInButton extends Buttons {

    public SignInButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        FirstFrame.frame.dispose();
        SignInFrame.frame = new SignInFrame();
    }
}
