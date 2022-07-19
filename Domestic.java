package OOP_PROJECT;

import java.util.Scanner;

abstract class Dflight {

    static int Dflight_seats[] = new int[5];
    static int Dflight_price[] = new int[5];
    static String Dflights[] = new String[5];
    static {
        Dflight_price[0] = 1200;
        Dflight_price[1] = 1000;
        Dflight_price[2] = 5110;
        Dflight_price[3] = 2010;
        Dflight_price[4] = 1300;
        for (int i = 0; i < Dflight_seats.length; i++) {
            Dflight_seats[i] = 10;
        }
        Dflights[0] = "1.Rajkot->Surat";
        Dflights[1] = "2.Junagadh->Rajkot";
        Dflights[2] = "3.Surat->Vadoodara";
        Dflights[3] = "4.Surat->Rajkot";
        Dflights[4] = "5.Vadodara->Ahemdabad";
    }

    abstract void Flight_List();

    abstract void selectFlights() throws Exception, InterruptedException;

    // we will going to define the instance of Dflight and use the
    // constructor of the Domestic or International class, Though the edit method is
    // normal method we are hiding from the user

}

class AdminDFLight extends Dflight {

    // static String[] Doflights = new String[5];

    AdminDFLight() {

    }

    public void Flight_List() {
        System.out.println("\n--------------------------------------");
        System.out.println("------ LIST OF DOMESTIC FLIGHTS ------");
        System.out.println("--------------------------------------\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(Dflights[i]);
        }
        System.out.println("\n-----------------------------------------------");
    }

    public void selectFlights() throws Exception, InterruptedException {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose the flight from the above list");
        a = sc.nextInt();
        try {
            int b = a / Dflight_seats[a - 1];
            TicketBook ok = new TicketBook();
            ok.Booking(0, a);
        } catch (Exception e) {
            throw new Exception("No Seats available for selected Domestic flight");
        }

    }

    protected void edit() {
        Flight_List();
        System.out.println("\nWhich Dommestic flight you want to edit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("\nEnter new Domestic flight details : ");
        String s = sc.next();
        Dflights[a - 1] = s;
        Dflight_seats[a - 1] = 10;

    }

    protected void Change_Price() {
        Scanner sc = new Scanner(System.in);
        Flight_List();
        System.out.println("\nWhich Dommestic flight you want to edit");
        int s;
        s = sc.nextInt();
        System.out.println("\nOld Price : " + Dflight_price[s - 1]);
        System.out.println("Enter new Price : ");
        Dflight_price[s - 1] = sc.nextInt();

    }

}

public class Domestic {

    Dflight ob = new AdminDFLight();

    void Domestics() throws InterruptedException, Exception {
        ob.Flight_List();
        ob.selectFlights();
        // ob.Change_Price();
    }

}