package MainPackage;

import DatabasePackage.DatabaseClass;
import GUI.GUIThread;
import javax.swing.*;
import java.sql.SQLException;
import java.util.LinkedList;

public class Main {
    class nod{
        String h;
        String k;
        String s;
    }
    LinkedList<nod> lista=new LinkedList();
    public static void main(String[] args) {
        GUIThread guiThread = new GUIThread();
        lista.getFirst().
        SwingUtilities.invokeLater(guiThread);
        try {
            DatabaseClass db = DatabaseClass.getInstance();
            db.start();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }

}
