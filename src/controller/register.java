package controller;
import model.user;
import util.hashed;
import database.connectionstring;
import java.net.StandardSocketOptions;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class register {

    public static String DBname="";
    public static String DBsurname="";
    public static String DBusername = "";
    public static String DBpassword = "";
    public static String hashedpass="";

    public static void register() throws Exception {


        Scanner sc = new Scanner(System.in);
        System.out.println("AD daxil edin: ");
        DBname = sc.nextLine();
        System.out.println("SOYAD daxil edin: ");
        DBsurname = sc.nextLine();
        System.out.println("Username daxil edin: ");
        DBusername = sc.nextLine();
        System.out.println("Password daxil edin: ");
        DBpassword = sc.nextLine();

        hashedpass = hashed.getHash(DBpassword);

        try {
            Connection c = connectionstring.connect();
            PreparedStatement stm = c.prepareStatement("INSERT INTO users(name,surname,username,password) VALUES(?,?,?,?)");
            stm.setString(1,DBname);
            stm.setString(2,DBsurname);
            stm.setString(3,DBusername);
            stm.setString(4,hashedpass);
            stm.execute();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

