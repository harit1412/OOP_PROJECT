package OOP_PROJECT;

import java.util.Scanner;

abstract class Dflight {
    
    static int Dflight_seats[] = new int[5];
    static String Dflights[] = new String[5];
    static {
        for (int i = 0; i < Dflight_seats.length; i++) {

            Dflight_seats[i] = 10;
        }
    }

    abstract void Flight_List();

    abstract void selectFlights() throws Exception, InterruptedException;

    // we will going to define the instance of Dflight and use the
    // constructor of the Domestic or International class, Though the edit method is
    // normal method we are hiding from the user

}

class AdminDFLight extends Dflight {

    String[] Doflights = new String[5];

    AdminDFLight() {
        Doflights[0] = "1.Rajkot -> Surat";
        Doflights[1] = "2.Junagadh -> Rajkot";
        Doflights[2] = "3.Surat -> Vadoodara";
        Doflights[3] = "4.Surat -> Rajkot";
        Doflights[4] = "5.Vadodara -> Ahemdabad";
    }

    public void Flight_List() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Doflights[i]);
        }
    }

    public void selectFlights() throws Exception, InterruptedException {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        try {
            int b = a / Dflight_seats[a - 1];
            TicketBook ok = new TicketBook();
            ok.Booking(0,a);
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
        Doflights[a - 1] = s;

    }

}

public class Domestic {

    Dflight ob = new AdminDFLight();

    void Domestics() throws InterruptedException, Exception {
        ob.Flight_List();
        ob.selectFlights();
    }

}