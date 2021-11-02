package GUI.UserWindow;

import DataStructures.IQueue;
import GUI.AbstractClasses.Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static MainPackage.Main.queue;

public class SubmitNewItemButton extends Buttons {

    SubmitNewItemButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String itemName = AddNewItemFrame.getFrame(null, null).itemNameField.getText();
        String description = AddNewItemFrame.getFrame(null, null).descriptionField.getText();
        String username = AddNewItemFrame.getFrame(null, null).getUsername();

        try {
            int idItem = Integer.parseInt(AddNewItemFrame.getFrame(null, null).idItemField.getText()); // throws NumberFormatException
            int quantity = Integer.parseInt(AddNewItemFrame.getFrame(null, null).itemQuantityField.getText()); // throws NumberFormatException


            synchronized (queue) {
                queue.enqueue(IQueue.newItem);
                queue.enqueue(username);
                queue.enqueue(String.valueOf(idItem));
                queue.enqueue(itemName);
                queue.enqueue(String.valueOf(quantity));
                queue.enqueue(description);
            }

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "The introduced data is not a number", "New item error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception exception) {
            exception.printStackTrace();

        } finally {
            UserFrame.getFrame(username);
            //AddNewItemFrame.disposeFrame(); // am cv eroare, nuj dc
        }

    }
}
