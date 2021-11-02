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
        try {
            int idItem = Integer.parseInt(AddNewItemFrame.getFrame(null).idItemField.getText()); // throws NumberFormatException
            int quantity = Integer.parseInt(AddNewItemFrame.getFrame(null).itemQuantityField.getText()); // throws NumberFormatException
            String itemName = AddNewItemFrame.getFrame(null).itemNameField.getText();
            String description = AddNewItemFrame.getFrame(null).descriptionField.getText();

            synchronized (queue) {
                queue.enqueue(IQueue.newItem);
                queue.enqueue(String.valueOf(idItem));
                queue.enqueue(itemName);
                queue.enqueue(String.valueOf(quantity));
                queue.enqueue(description);
            }

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "The introduced data is not a number", "New item error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
