package GUI.signInWindow;

import CustomExceptions.InvalidPasswordException;
import CustomExceptions.InvalidUsernameException;
import DataStructures.Queue;
import GUI.AbstractClasses.Buttons;

import javax.swing.*;
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

        try {
            if (username.length() < 4 || username.length() > 20)
                throw new InvalidUsernameException();

            if (password.length() < 4 || password.length() > 20)
                throw new InvalidPasswordException();

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

        } catch (InvalidUsernameException exception) {
            JOptionPane.showMessageDialog(null, "The username must be between 4 and 20 characters", "Username error", JOptionPane.ERROR_MESSAGE);

        } catch (InvalidPasswordException exception) {
            JOptionPane.showMessageDialog(null, "The password must be between 4 and 20 characters", "Password error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Sign In failed", JOptionPane.ERROR_MESSAGE);
        }
    }

}
