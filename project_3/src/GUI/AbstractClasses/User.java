package GUI.AbstractClasses;

import GUI.UserWindow.IUser;
import GUI.UserWindow.UserProfile;

public abstract class User extends UserProfile implements IUser {

    public User(String username, String password) {
        super(username, password);
    }

}
