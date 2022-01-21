package util;

import controller.login;
import controller.register;

import java.util.Scanner;

public class dashboard {
    public static void ekran() throws Exception{
        while (true) {
            Scanner sec = new Scanner(System.in);
            System.out.println("-----------------------------------" +
                    "\nDavam etmek istediyiniz menu uzre sechim edin: " +
                    "\n1: LOGIN \n2: QEYDIYYAT \nq: CIXISH");
            String secim = sec.nextLine();
            if (secim.equals("1")) {
                login.LogIn();
            } else if (secim.equals("2")) {
                register.register();
            } else if (secim.equals("q")) {
                break;
            } else {
                System.out.println("Yanliz yuxarida qeyd olunan secimleri etmelisiniz!...");
            }
        }
    }
}
