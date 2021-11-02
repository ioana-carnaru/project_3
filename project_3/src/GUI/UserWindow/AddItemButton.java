package GUI.UserWindow;

import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

public class AddItemButton extends Buttons { // in UserFrame

    AddItemButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AddNewItemFrame.getFrame(UserFrame.getFrame("").getUsername(), UserFrame.getFrame("").getResultSet());
        UserFrame.disposeFrame();
    }
}
