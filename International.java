package OOP_PROJECT;

import java.util.Scanner;

abstract class Inflight {
    
    static int Inflight_seats[] = new int[5];
    static String Inflights[] = new String[5];
    static {
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
        Inflights[0] = "1.Delhi -> USA";
        Inflights[1] = "2.Mumbai -> Germany";
        Inflights[2] = "3.Hydrabad -> Africa";
        Inflights[3] = "4.Ahemdabad -> Dubai";
        Inflights[4] = "5.Chennai -> New-Jersy";
    }

    public void Flight_List() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Inflights[i]);
        }
    }

    public void selectFlights() throws Exception, InterruptedException {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try {
            int b = a / Inflight_seats[a - 1];
            TicketBook ok = new TicketBook();
            ok.Booking(1,a);
        } catch (Exception e) {
            throw new Exception("No Seats available for selected Dflight");
        }

    }

    protected void edit() {
        Flight_List();
        System.out.println("Which Dflight you want to edit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter new Dflight details: ");
        String s = sc.next();
        Inflights[a - 1] = s;

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








