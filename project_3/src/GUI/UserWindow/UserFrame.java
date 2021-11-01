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

    private ResultSet resultSet=null;

    //AddItemButton addItemButton;

    AddItemButton addItemButton;
    DisplayButton displayButton;


    private UserFrame (String username) {
        super(username);
        this.username = username;
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());

        displayButton = new DisplayButton("Display Inventory");
        addItemButton = new AddItemButton("Add new item");

        this.add(displayButton);
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
//    public void ShowRes()
//    {
//        try {
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("username") + " " + resultSet.getInt("iditem") + " " + resultSet.getInt("quantity"));
//            }
//        }
//        catch (SQLException ex)
//        {
//            ex.printStackTrace();
//        }
//    }
}
