package OOP_PROJECT;

import java.util.*;

// a -> 0 > Domestic
// a -> 1 > International

// f -> flight  num

interface book {

    void Booking(int a, int f) throws Exception;
}

public class TicketBook implements book {
    static ArrayList<ArrayList<String>> Person_Details;

    static {
        Person_Details = new ArrayList<ArrayList<String>>();
    }

    public void Booking(int a, int f) throws Exception {

        System.out.println("\n---------------------------------------------");
        System.out.println("------------- PASSNGERS DETAILS---------------");
        System.out.println("---------------------------------------------");

        System.out.println("\nNumber of passengers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            if (a == 0) {
                if (n > Dflight.Dflight_seats[f - 1]) {
                    int c = 1 / 0;
                }
            }
            if (a == 1) {
                if (n > Inflight.Inflight_seats[f - 1]) {
                    int c = 1 / 0;
                }
            }
        } catch (Exception e) {
            throw new Exception("not enough seats");

        }

        String first[] = new String[n];
        String last[] = new String[n];
        String pass[] = new String[n];
        String age[] = new String[n];
        String gender[] = new String[n];
        String ddate[] = new String[n];
        for (int i = 0; i < n; i++) {
            ArrayList<String> p = new ArrayList<String>();

            System.out.println(
                    "\n---------------------------------------------------------------------------------------------");

            System.out.println("First Name : ");
            first[i] = sc.next();

            System.out.println("\nLast Name : ");
            last[i] = sc.next();
            p.add(first[i] + " " + last[i]);

            System.out.println("\nPassport Number : ");
            pass[i] = sc.next();
            p.add(pass[i]);

            System.out.println("\nAge : ");
            age[i] = sc.next();
            p.add(age[i]);

            System.out.println("\nGender : ");
            gender[i] = sc.next();
            p.add(gender[i]);

            System.out.println("\nDeparture Date(DD/MM/yyyy) : ");
            ddate[i] = sc.next();
            p.add(ddate[i]);
            System.out.println(
                    "---------------------------------------------------------------------------------------------\n");

            Person_Details.add(p);

        }
        if (a == 0) {
            Dflight.Dflight_seats[f - 1] -= n;

            System.out.println("\nYour flight ticket is successfully Booked for flight " + Dflight.Dflights[f - 1]);

            System.out
                    .println("\nAvailalable seats in " + Dflight.Dflights[f - 1] + " is "
                            + Dflight.Dflight_seats[f - 1]);
        } else {
            Inflight.Inflight_seats[f - 1] -= n;

            System.out
                    .println("\nYour flight ticket is successfully Booked for flight " + Inflight.Inflights[f - 1]);

            System.out
                    .println("\nAvailalable seats in " + Inflight.Inflights[f - 1] + " is "
                            + Inflight.Inflight_seats[f - 1]);

        }
        System.out.println(
                "---------------------------------------------------------------------------------------------\n");
        TicketPrint prin = new TicketPrint();
        prin.Print(n, first, last, pass, age, gender, ddate, a, f);

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