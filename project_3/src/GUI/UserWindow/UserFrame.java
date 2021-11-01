package GUI.UserWindow;

import DataStructures.IQueue;
import GUI.AbstractClasses.Frames;

import java.awt.*;
import java.sql.ResultSet;

import static MainPackage.Main.queue;

public class UserFrame extends Frames {

    private static UserFrame frame;
    private String username = null;

    private ResultSet resultSet;

    AddItemButton addItemButton;


    private UserFrame (String username) {
        super(username);
        this.username = username;
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());

        synchronized (queue) {
            queue.enqueue(IQueue.showInventory);
        }

        addItemButton = new AddItemButton("Add Item");
        this.add(addItemButton);
        this.setVisible(true);
    }

    public static UserFrame getFrame (String username) {
        if (frame == null)
            frame = new UserFrame(username);

        return frame;
    }


    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
