package GUI.signInWindow;

import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

public class SubmitSignInButton extends Buttons {

    public SubmitSignInButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("sign in");
    }
}
