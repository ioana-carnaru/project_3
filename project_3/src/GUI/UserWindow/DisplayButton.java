package GUI.UserWindow;

import GUI.AbstractClasses.Buttons;

import java.awt.event.ActionEvent;

public class DisplayButton extends Buttons {

    DisplayButton (String text) {
        super(text);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        UserItems.getFrame(UserFrame.getFrame("").getResultSet());
        UserFrame.disposeFrame();
    }
}
