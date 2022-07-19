package OOP_PROJECT;

import java.util.Scanner;

public class Admin {
    void FirstPage() throws Exception {

        System.out.println("1.Book");
        System.out.println("2.Edit Flight");
        System.out.println("3.Edit Price");
        System.out.println("4.Print the passenger list");
        System.out.println("5.Back");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the choice from above");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Flight_Type Ft = new Flight_Type();
                Ft.Select_Type();
                break;
            case 2:
                System.out.println("1.Domestic");
                System.out.println("2.International");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        AdminDFLight ob2 = new AdminDFLight();
                        ob2.edit();
                        ob2.Flight_List();
                        break;
                    case 2:
                        AdminINFLight ob = new AdminINFLight();
                        ob.edit();
                        ob.Flight_List();
                        break;
                }
                LogIn ob3 = new LogIn();
                ob3.Login();
                break;
            case 3:
                System.out.println("1.Domestic");
                System.out.println("2.International");
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        AdminDFLight ob2 = new AdminDFLight();
                        ob2.Change_Price();
                        break;
                    case 2:
                        AdminINFLight ob = new AdminINFLight();
                        ob.Change_Price();
                        break;
                }
                LogIn ob4 = new LogIn();
                ob4.Login();
                break;
            case 4:
                System.out.println(TicketBook.Person_Details);
                LogIn ob2 = new LogIn();
                ob2.Login();
                break;
            case 5:
                LogIn ob = new LogIn();
                ob.Login();
                break;
        }

    }
}
