package OOP_PROJECT;

import java.util.Scanner;

abstract class Inflight {

    static int Inflight_seats[] = new int[5];
    static int Inflight_price[] = new int[5];
    static String Inflights[] = new String[5];
    static {
        Inflight_price[0] = 12000;
        Inflight_price[1] = 10000;
        Inflight_price[2] = 5000;
        Inflight_price[3] = 2000;
        Inflight_price[4] = 13000;

        for (int i = 0; i < Inflight_seats.length; i++) {

            Inflight_seats[i] = 10;
        }
    }

    abstract void Flight_List();

    abstract void selectFlights() throws Exception, InterruptedException;

    // we will going to define the instance of Dflight and use the
    // constructor of the Domestic or International class, Though the edit method is
    // normal method we are hiding from the user

}

class AdminINFLight extends Inflight {

    AdminINFLight() {
        Inflights[0] = "1.Delhi->USA";
        Inflights[1] = "2.Mumbai->Germany";
        Inflights[2] = "3.Hydrabad->Africa";
        Inflights[3] = "4.Ahemdabad->Dubai";
        Inflights[4] = "5.Chennai->New-Jersy";
    }

    public void Flight_List() {
        System.out.println("\n------ LIST OF INTERNATIONAL FLIGHTS ------\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(Inflights[i]);
        }
        System.out.println("\n-----------------------------------------------");
    }

    public void selectFlights() throws Exception, InterruptedException {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try {
            int b = a / Inflight_seats[a - 1];
            TicketBook ok = new TicketBook();
            ok.Booking(1, a);
        } catch (Exception e) {
            throw new Exception("No Seats available for selected International flight");
        }

    }

    protected void edit() {
        Flight_List();
        System.out.println("Which International flight you want to edit : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter new International flight details : ");
        String s = sc.next();
        Inflights[a - 1] = s;

    }

    protected void Change_Price() {
        Scanner sc = new Scanner(System.in);
        Flight_List();
        System.out.println("Which International flight you want to edit");
        int s;
        s = sc.nextInt();
        System.out.println("Old Price : " + Inflight_price[s - 1]);
        System.out.println("Enter new Price : ");
        Inflight_price[s - 1] = sc.nextInt();

    }
}

////////

public class International {

    Inflight ob = new AdminINFLight();

    void Internationals() throws InterruptedException, Exception {
        ob.Flight_List();
        ob.selectFlights();
    }

}
// bookticket
// back button
// admin delete and add the flight and change the price
// array string\
// in the booking we get the number of passenger from the user and add
// there name,age,gender,passport details, date,
// check that the flight is availoble on that day or not
// hide edit function's functionality from the user

// business
//
