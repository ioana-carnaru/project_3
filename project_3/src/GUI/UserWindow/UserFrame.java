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


    private UserFrame (String username) {
        super(username);
        this.username = username;
        this.setSize(300, 300);
        this.setLayout(new FlowLayout());

   /* try {
        Thread.sleep(1000);
        while (resultSet!=null) {
            System.out.println(resultSet.getString("username") + " " + resultSet.getInt("iditem") + " " + resultSet.getInt("quantity"));
        }
    }
    catch (SQLException | InterruptedException ex)
    {
        ex.printStackTrace();
    }*/
      //this.add(addItemButton);
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
