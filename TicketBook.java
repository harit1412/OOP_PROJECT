package OOP_PROJECT;

import java.util.*;

interface book {
    void Booking(int a, int f) throws Exception;
}

public class TicketBook implements book {
    static ArrayList<ArrayList<String>> Person_Details;

    static {
        Person_Details = new ArrayList<ArrayList<String>>();
    }

    public void Booking(int a, int f) throws Exception {

        // a0 -> domestic
        // f1 -> 0th arr

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
            ArrayList<String> p = new ArrayList<String>();

            System.out.println("First Name : ");
            first[i] = sc.next();

            System.out.println("Last Name : ");
            last[i] = sc.next();
            p.add(first[i] + " " + last[i]);

            System.out.println("Passport Number : ");
            pass[i] = sc.next();
            p.add(pass[i]);

            System.out.println("Age : ");
            age[i] = sc.next();
            p.add(age[i]);

            System.out.println("Gender : ");
            gender[i] = sc.next();
            p.add(gender[i]);

            System.out.println("Departure Date(DD/MM/yyyy) : ");
            ddate[i] = sc.next();
            p.add(ddate[i]);

            Person_Details.add(p);

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