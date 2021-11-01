package GUI.UserWindow;

import DataStructures.IQueue;
import GUI.AbstractClasses.Frames;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

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

        try {
//            while (resultSet == null || resultSet.next() == false)
//                Thread.sleep(10);
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(0) + " " + resultSet.getString(1) + " " + resultSet.getString(2));
//            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }

        this.add(addItemButton);
        this.setVisible(true);
    }

    public static UserFrame getFrame (String username) {
        if (frame == null)
            frame = new UserFrame(username);

        return frame;
    }

    public static void disposeFrame() {
        frame.dispose();
        frame = null;
    }


    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
