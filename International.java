package OOP_PROJECT;

import java.util.Scanner;

public class International extends flight {
    static int Iflight_seats[] = new int[5];
    static String Iflights[] = new String[5];

    International() {
        // Iflight_seats[0] = 0;
        for (int i = 0; i < Iflight_seats.length; i++) {
            Iflight_seats[i] = 10;
        }
    }

    @Override
    public void Flight_List() {

        String[] Inflights = new String[5];
        Inflights[0] = "1.Delhi -> USA";
        Inflights[1] = "2.Mumbai -> Germany";
        Inflights[2] = "3.Hydrabad -> Africa";
        Inflights[3] = "4.Ahemdabad -> Dubai";
        Inflights[4] = "5.Chennai -> New-Jersy";
        for (int i = 0; i < Iflight_seats.length; i++) {
            System.out.println(Inflights[i]);
        }

    }

    @Override
    public void selectFlights() throws Exception {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (Iflight_seats[a - 1] == 0)
            throw new Exception("No Seats available for selected flight");
        else {
            TicketBook ok = new TicketBook();
            ok.Booking();
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

    //business 
    //

}
