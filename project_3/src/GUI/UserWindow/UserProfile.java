package GUI.UserWindow;

public class UserProfile {

    public String username;
    public String password;

    public UserProfile(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }


}
