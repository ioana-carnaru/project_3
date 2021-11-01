package GUI.UserWindow;

import DataStructures.IQueue;
import GUI.AbstractClasses.Frames;

import java.sql.ResultSet;

import static MainPackage.Main.queue;

public class UserFrame extends Frames {

    private static UserFrame frame;
    private String username;

    private ResultSet resultSet;


    public UserFrame (String username) {
        super(username);
        this.username = username;

        synchronized (queue) {
            queue.enqueue(IQueue.showInventory);
        }
    }


    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
}
