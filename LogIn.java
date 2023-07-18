package OOP_PROJECT;

import java.util.Scanner;

class CheckUser {
/*
    --> I have used static because , we know that many people is going to login , so each time person trying to login
    object of CheckUser will be created , to avoid too much use of memory , it is good to have a static variable.
*/
    static protected String[][] lst = new String[6][6]; // list of people who have registered in sites..
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

public class LogIn {
     String Username;
     String Password;

    void Login() throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------------------------------------------");
        System.out.println("----- Welcome to the Flight Booking System -----");
        System.out.println("------------------------------------------------\n");

        System.out.println("\n========================");
        System.out.println("====== LOGIN PAGE ======");
        System.out.println("========================");

        System.out.println("----------------------------------");
        System.out.println("Username : ");
        LogIn.Username = sc.next();
        System.out.println("Password : ");
        LogIn.Password = sc.next();
        System.out.println("----------------------------------");

        boolean IsUser = CheckUser.checkUser(LogIn.Username, LogIn.Password);

        boolean IsAdmin = CheckUser.checkAdmin(LogIn.Username, LogIn.Password);

        if (IsUser == true) {
            Flight_Type Ft = new Flight_Type();
            Ft.Select_Type();
        } else if (IsAdmin == true) {
            Admin ad = new Admin();
            ad.FirstPage();
        } else {
            throw new Exception("\nInvalid User");
        }
    }

    public static void main(String[] args) throws Exception, InterruptedException {
        LogIn ob3 = new LogIn();
        ob3.Login();
    }
}
