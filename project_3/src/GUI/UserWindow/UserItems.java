package GUI.UserWindow;

import GUI.AbstractClasses.Frames;

import java.sql.ResultSet;

public class UserItems extends Frames {

    private static UserItems frame;
    private ResultSet resultSet;

    private UserItems(String title, ResultSet resultSet) {
        super(title);
        this.resultSet = resultSet;
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
