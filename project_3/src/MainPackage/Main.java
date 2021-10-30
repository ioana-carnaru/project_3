package MainPackage;

import DatabasePackage.DatabaseClass;
import GUI.GUIThread;

import javax.swing.*;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        GUIThread guiThread = new GUIThread();
        SwingUtilities.invokeLater(guiThread);

//        try {
//            DatabaseClass db = DatabaseClass.getInstance();
//            db.start();
//        }
//        catch(SQLException ex)
//        {
//            ex.printStackTrace();
//        }
    }

}
