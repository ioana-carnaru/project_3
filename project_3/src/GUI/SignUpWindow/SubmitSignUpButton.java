package GUI.SignUpWindow;

import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

public class SubmitSignUpButton extends Buttons {

    public SubmitSignUpButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sign Up");
    }
}
