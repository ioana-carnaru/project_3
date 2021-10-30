package GUI.SignUpWindow;

import DataStructures.Queue;
import GUI.AbstractClasses.Buttons;
import GUI.signInWindow.SignInFrame;

import java.awt.event.ActionEvent;

import static MainPackage.Main.queue; // the transmission queue

public class SubmitSignUpButton extends Buttons {

    public SubmitSignUpButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = SignUpFrame.getFrame().usernameField.getText();
        String password = String.valueOf(SignUpFrame.getFrame().passwordField.getPassword());

        synchronized (queue) {
            queue.enqueue(Queue.newAccount);
            queue.enqueue(username);
            queue.enqueue(password);
        }
    }

}
