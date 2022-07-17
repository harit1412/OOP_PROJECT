package OOP_PROJECT;

import java.util.*;

interface book {
    void Booking(int a, int f);
}

public class TicketBook implements book {

    public void Booking(int a, int f) {

        System.out.println("---------------------------------------------");
        System.out.println("------------- PASSNGERS DETAILS---------------");

        System.out.println("Number of passengers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String first[] = new String[n];
        String last[] = new String[n];
        String pass[] = new String[n];
        String age[] = new String[n];
        String gender[] = new String[n];
        String ddate[] = new String[n];
        for (int i = 0; i < n; i++) {

            System.out.println("First Name : ");
            first[i] = sc.next();

            System.out.println("Last Name : ");
            last[i] = sc.next();

            System.out.println("Passport Number : ");
            pass[i] = sc.next();

            System.out.println("Age : ");
            age[i] = sc.next();

            System.out.println("Gender : ");
            gender[i] = sc.next();

            System.out.println("Departure Date(DD/MM/yyyy) : ");
            ddate[i] = sc.next();
        }
        if (a == 0) {
            Dflight.Dflight_seats[f - 1] -= n;
            System.out
                    .println("Availalable seats in " + Dflight.Dflights[f - 1] + " is " + Dflight.Dflight_seats[f - 1]);
        } else {
            Inflight.Inflight_seats[f - 1] -= n;
            System.out
                    .println("Availalable seats in " + Inflight.Inflights[f - 1] + " is "
                            + Inflight.Inflight_seats[f - 1]);

        }
        TicketPrint prin = new TicketPrint();
        prin.Print(n, first, last, pass, age, gender, ddate);

    }

}

/*
 * 
 * -----Ticket-----
 * Passenger - i :>
 * name:
 * pass:
 * age:
 * gender:
 * ddate:
 * 
 * 
 * 
 * 
 */