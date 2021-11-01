package GUI.UserWindow;

import GUI.AbstractClasses.Frames;

import java.awt.*;
import java.sql.ResultSet;

public class UserItems extends Frames {

    private static UserItems frame;
    private ResultSet resultSet;



    private UserItems(String title, ResultSet resultSet) {
        super(title);
        this.resultSet = resultSet;
        this.setLayout(new FlowLayout());

        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("username") + " " + resultSet.getInt("iditem") + " " + resultSet.getInt("quantity"));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }


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
