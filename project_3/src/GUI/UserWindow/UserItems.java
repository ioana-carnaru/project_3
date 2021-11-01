package GUI.UserWindow;

import GUI.AbstractClasses.Frames;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserItems extends Frames {

    private static UserItems frame;
    private ResultSet resultSet;
    private ArrayList <JLabel> items = new ArrayList<>();
    private JPanel panel;



    private UserItems(String title, ResultSet resultSet) {
        super(title, 300, 300);
        this.resultSet = resultSet;
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        try {
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("username") + " " + resultSet.getInt("iditem") + " " + resultSet.getInt("quantity"));
//            }
            items.add(new JLabel("iditem - quantity"));
            int counter = 0;
            JLabel label;

            while (resultSet.next()) {
                label = new JLabel((++counter) + ":  " + resultSet.getInt("iditem") + "  -  " + resultSet.getInt("quantity"));
                label.setVerticalAlignment(JLabel.TOP);
                label.setHorizontalAlignment(JLabel.CENTER);
                items.add(label);
            }

            for (JLabel labelIterator: items) { // add labels to the panel
                panel.add(labelIterator);
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }


        this.add(panel);
        this.setVisible(true);
    }

    public static UserItems getFrame (ResultSet resultSet) {
        if (frame == null)
            frame = new UserItems("User items", resultSet);

        return frame;
    }

    public void disposeFrame() {
        frame.disposeFrame();
        frame = null;
    }
}
