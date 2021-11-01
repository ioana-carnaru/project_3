package DatabasePackage;


import DataStructures.IQueue;
import GUI.UserWindow.UserFrame;
import GUI.signInWindow.SignInFrame;
import MainPackage.Main;

import javax.swing.*;
import java.sql.*;

public class DatabaseClass extends Thread {
    private static DatabaseClass instance;
    private Connection con;
    private int _idCounter = 0;

    private DatabaseClass() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management", "root", "toor");
            System.out.println("Conexiune reusita");
            setDaemon(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DatabaseClass getInstance() throws SQLException {
        if (null == instance) {
            instance = new DatabaseClass();
        } else if (instance.getCon().isClosed()) {
            instance = new DatabaseClass();
        }
        return instance;
    }

    public Connection getCon() {
        return con;
    }

    /* public void getMaxValueOfId() {
         try {
             Statement stm = con.createStatement();
             ResultSet rs = stm.executeQuery("SELECT MAX(id) from people as Max;");

             if (rs.next()) {
                 _idCounter = rs.getInt(1) + 1;
             }
             stm.close();
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
     }
 */
    public void run() {

        // getMaxValueOfId();
        //Sincronizam instanta bazei de date
        synchronized (instance) {
            while (true) {
                //verificam daca am apasat pe submit
                if (Main.queue.isEmpty()) {
                    //cat timp nu
                    try {
                        //asteptam
                        //   System.out.println("We are waiting for input");
                        wait(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    //altfel efectuam un query cu datele pe care le-am citit din SubmitSignInButtonClass si le introducem intr-un result set. Daca result set e null, adica nu sunt valori valide in baza, at nu avem valori;
                } else {
                    try {
                        String typeOfAction = Main.queue.dequeue();
                        System.out.println(typeOfAction);
                        if (typeOfAction.equals(IQueue.logIn)) {
                            String nameUser = Main.queue.dequeue();
                            String passwordUser = Main.queue.dequeue();
                            String searchForUser = "select * from users where username='" + nameUser + "' and password='" + passwordUser + "';";
                            Statement stm = con.createStatement();
                            ResultSet rs = stm.executeQuery(searchForUser);

                            if (rs.next()) {
                                System.out.println("Am gasit valori "+nameUser+" "+passwordUser);
                                SignInFrame.getFrame().setIsSignedIn(true);
                                Statement statementForItemsUser=con.createStatement();
                                String searchForItemsForUser="Select * from inventory where username='"+nameUser+"';";
                                ResultSet resultSetItemsForUser=statementForItemsUser.executeQuery(searchForItemsForUser);
                               /* while(resultSetItemsForUser.next())
                                {
                                    System.out.println(resultSetItemsForUser.getString("username") + " " + resultSetItemsForUser.getInt("iditem") + " " + resultSetItemsForUser.getInt("quantity"));
                                }*/
                                wait(1000);
                                UserFrame.getFrame("").setResultSet(resultSetItemsForUser);
                                statementForItemsUser.close();
                                stm.close();
                               // notifyAll();

                            } else {
                                System.out.println("Nu am gasit valori");
                            }
                        } else if (typeOfAction.equals((IQueue.newAccount))) {
                            String nameUser = Main.queue.dequeue();
                            String passwordUser = Main.queue.dequeue();
                            Statement stm = con.createStatement();
                            String insertTheUser = "INSERT INTO users VALUES ('" + nameUser + "','" + passwordUser + "')";
                            stm.executeUpdate(insertTheUser);
                            //this._idCounter++;
                            stm.close();
                        }

                        notify();
                    } catch (SQLException | InterruptedException ex) {
                        ex.printStackTrace();
                        //JOptionPane.showMessageDialog(null, "The username already exists", "Username error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }
}
/*  Incercarea initiala
  if (SignInFrame.getFrame().getSubmitSignInButton().is_wantsToSignIn()) {
                            System.out.println("Want to search for items such as " + SignInFrame.getFrame().getSubmitSignInButton().getUser() + " and " + SignInFrame.getFrame().getSubmitSignInButton().getPassword());
                            Statement stm = con.createStatement();
                            ResultSet rs = stm.executeQuery("select * from people where userName='" + SignInFrame.getFrame().getSubmitSignInButton().getUser() + "';");
                            if (rs.next()) {
                                System.out.println("Am gasit valori");
                            } else {
                                System.out.println("Nu am gasit valori");
                            }
                            SignInFrame.getFrame().getSubmitSignInButton().set_wantsToSignIn(false);
                            stm.close();
                        } else if (SignUpFrame.getFrame().getSubmitSignUpButton().is_wantsToSignUp()) {
                            System.out.println("Vrem sa aduagam in baza de date user");
                            Statement stm=con.createStatement();
                            stm.executeUpdate("INSERT INTO people VALUES ('"+_idCounter+"','"+ SignUpFrame.getFrame().getSubmitSignUpButton().getUser()+"','"+SignUpFrame.getFrame().getSubmitSignUpButton().getPassword()+"')");
                            this._idCounter++;
                            stm.close();
                            SignUpFrame.getFrame().getSubmitSignUpButton().set_wantsToSignUp(false);
                        }
                        //Resetam inputul
                        SignInFrame.getFrame().getSubmitSignInButton().set_hasInput(false);
                        SignUpFrame.getFrame().getSubmitSignUpButton().set_hasInput(false);*/
// notify();
