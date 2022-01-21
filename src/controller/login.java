package controller;
import model.*;
import database.connectionstring;
import util.hashed;
import java.net.StandardSocketOptions;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class login {

    public static void LogIn() throws Exception {


        Scanner sc = new Scanner(System.in);
        System.out.println("Username daxil edin: ");
        String usrnm = sc.nextLine();
        System.out.println("Password daxil edin: ");
        String pswd = sc.nextLine();

        register.hashedpass = hashed.getHash(pswd);

        try {
            Connection c = connectionstring.connect();
            PreparedStatement stm = c.prepareStatement("select * from users where username=? and password=?");
            stm.setString(1,usrnm);
            stm.setString(2, register.hashedpass);
            stm.execute();
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {

                register.DBname = rs.getString("name");
                register.DBsurname = rs.getString("surname");
                register.DBusername = rs.getString("username");
                register.DBpassword = rs.getString("password");
            }

            if (usrnm.equals(register.DBusername) && register.hashedpass.equals(register.DBpassword)) { //equalsla bagli sual!!!
                System.out.println("Sisteme daxil oldunuz ! " +
                        "\n XOSH GELDINIZ " + register.DBname + " " + register.DBsurname + " bey!...");

            } else {
                System.out.println("Istifadeci adi ve ya parol yanlishdir !...");
            }

        }catch(Exception e){
            System.out.println("Daxil etdiyiniz format yanlishdir...");
        }
    }
}
