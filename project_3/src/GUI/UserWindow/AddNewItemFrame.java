package GUI.UserWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class AddNewItemFrame extends Frames {

    private static AddNewItemFrame frame;
    private ResultSet resultSet;
    private JPanel panel;

    JLabel idItemLabel;
    JTextField idItemField;
    JLabel itemNameLabel;
    JTextField itemNameField;
    JLabel itemQuantityLabel;
    JTextField itemQuantityField;
    JLabel descriptionLabel;
    JTextField descriptionField;
    SubmitNewItemButton submitNewItemButton;

    private AddNewItemFrame(String title, ResultSet resultSet) {
        super(title, 300, 300);
        this.resultSet = resultSet;

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idItemLabel = new JLabel("Id item:");
        idItemField = new JTextField();
        itemNameLabel = new JLabel("Item name:");
        itemNameField = new JTextField();
        itemQuantityLabel = new JLabel("Quantity:");
        itemQuantityField = new JTextField();
        descriptionLabel = new JLabel("Description:");
        descriptionField = new JTextField();
        submitNewItemButton = new SubmitNewItemButton("Submit");

        panel.add(idItemLabel);
        panel.add(idItemField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(itemNameLabel);
        panel.add(itemNameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(itemQuantityLabel);
        panel.add(itemQuantityField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(descriptionLabel);
        panel.add(descriptionField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(submitNewItemButton);

        this.add(panel);
        this.setVisible(true);
    }

    public static AddNewItemFrame getFrame (ResultSet resultSet) {
        if (frame == null)
            frame = new AddNewItemFrame("Add new Item", resultSet);

        return frame;
    }

    public void disposeFrame () {
        frame.disposeFrame();
        frame = null;
    }
}
