package GUI.signInWindow;

import DataStructures.Queue;
import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

import static MainPackage.Main.queue;

public class SubmitSignInButton extends Buttons {

    public SubmitSignInButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = SignInFrame.getFrame().usernameField.getText();
        String password = String.valueOf(SignInFrame.getFrame().passwordField.getPassword());

        synchronized (queue) {
            queue.enqueue(Queue.logIn);
            queue.enqueue(username);
            queue.enqueue(password);
        }

        synchronized (queue) { // IT WORKS !!!!!
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        }
    }

}
