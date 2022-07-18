package OOP_PROJECT;

import java.util.Scanner;

class CheckUser {
    static final protected String[][] lst = new String[6][6];
    static int i = 5;

    static {
        lst[0][0] = "a";
        lst[0][1] = "a";
        lst[1][0] = "Vraj";
        lst[1][1] = "Vraj";
        lst[2][0] = "Rushi";
        lst[2][1] = "Rushi";
        lst[3][0] = "Manav";
        lst[3][1] = "Manav";
        lst[4][0] = "Yash";
        lst[4][1] = "Yash";
    }

    static boolean checkUser(String a, String b) {
        boolean ans = false;
        for (int i = 0; i < 5; i++) {
            // System.out.println(lst[i][0] + " " + lst[i][1]);
            if (a.equals(lst[i][0]) && b.equals(lst[i][1])) {
                ans = true;
                break;
            }

        }
        return ans;

    }

    static boolean checkAdmin(String a, String b) {
        if (a.equals("Harit") && b.equals("Harit")) {
            return true;
        }
        return false;
    }
}

public class LogIn extends Flight_Type {
    static String Username;
    static String Password;

    public static void main(String[] args) throws Exception, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("----- Welcome to the Flight Booking System -----");
        System.out.println("------------------------------------------------\n");

        System.out.println("======LOGIN PAGE======\n");

        System.out.println("----------------------------------");
        System.out.println("Username : ");
        LogIn.Username = sc.next();
        System.out.println("Password : ");
        LogIn.Password = sc.next();
        System.out.println("----------------------------------");
        boolean ok = CheckUser.checkUser(LogIn.Username, LogIn.Password);

        boolean ok2 = CheckUser.checkAdmin(LogIn.Username, LogIn.Password);
        if (ok == true) {
            Flight_Type Ft = new Flight_Type();
            Ft.Select_Type();
        } else if (ok2 == true) {
            Admin ad = new Admin();
            ad.FirstPage();
        } else {
            throw new Exception("Invalid User");
        }
    }
}
