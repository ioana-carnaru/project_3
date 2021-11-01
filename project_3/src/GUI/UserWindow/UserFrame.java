package GUI.UserWindow;

import DataStructures.IQueue;
import GUI.AbstractClasses.Frames;

import static MainPackage.Main.queue;

public class UserFrame extends Frames {

    private static UserFrame frame;
    private String username;

    public UserFrame (String username) {
        super(username);
        this.username = username;

        synchronized (queue) {
            queue.enqueue(IQueue.showInventory);
        }
    }
}
