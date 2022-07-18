package OOP_PROJECT;

import java.util.Scanner;

public class Admin extends TicketPrint{
    void FirstPage() throws Exception {

        System.out.println("1.Book");
        System.out.println("2.Edit Flight");
        System.out.println("3.Edit Price");
        System.out.println("4.Print the passenger list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Flight_Type Ft = new Flight_Type();
                Ft.Select_Type();
                break;
            case 2:
                System.out.println("1.International");
                System.out.println("2.Domestic");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        AdminINFLight ob = new AdminINFLight();
                        ob.edit();
                        ob.Flight_List();
                        break;
                    case 2:
                        AdminDFLight ob2 = new AdminDFLight();
                        ob2.edit();
                        ob2.Flight_List();
                        break;
                }
                break;
            case 3:
                System.out.println("1.International");
                System.out.println("2.Domestic");
                int b = sc.nextInt();
                switch (b) {
                    case 1:
                        AdminINFLight ob = new AdminINFLight();
                        ob.Change_Price();
                        break;
                    case 2:
                        AdminDFLight ob2 = new AdminDFLight();
                        ob2.Change_Price();
                        break;
                }
                break;
            // case 4:
            //     TicketPrint println = new TicketPrint();
            //     p.Print(n, first, last, pass, age, gender, ddate);
        }

    } 
}
