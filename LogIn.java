package OOP_PROJECT;

import java.util.Scanner;

class CheckUser {
    static private String[][] lst = new String[6][6];
    static int i = 5;

    static {
        lst[0][0] = "a";
        lst[0][1] = "a";
        lst[1][0] = "Vraj";
        lst[1][1] = "202103016";
        lst[2][0] = "Rushi";
        lst[2][1] = "2021030";
        lst[3][0] = "Manav";
        lst[3][1] = "Manav";
        lst[4][0] = "Yash";
        lst[4][1] = "Yash";
    }

    static boolean Check(String a, String b) {
        boolean ans = false;
        for (int i = 0; i < 5; i++) {
            System.out.println(lst[i][0] + " " + lst[i][1]);
            if (a.equals(lst[i][0]) && b.equals(lst[i][1])) {
                ans = true;
                break;
            }

        }
        return ans;

    }
}

public class LogIn extends Thread {
    public static void main(String[] args) throws Exception, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String Username;
        String Password;

        System.out.println("Username : ");
        Username = sc.next();
        System.out.println("Password : ");
        Password = sc.next();

        boolean IsUser = CheckUser.Check(Username, Password);
        synchronized (currentThread()) {

            Loading.start_load();
            // notify();
        }
        if (IsUser) {
            Flight_Type Ft = new Flight_Type();
            Ft.Select_Type();
        } else {
            throw new Exception("Invalid User");
        }

    }
}