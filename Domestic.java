package OOP_PROJECT;

import java.util.Scanner;

interface flight {
    void Flight_List();

    void selectFlights() throws Exception, InterruptedException;
}

public class Domestic implements flight {

    static int Dflight_seats[] = new int[5];

    Domestic() {
        for (int i = 0; i < Dflight_seats.length; i++) {
            Dflight_seats[i] = 10;
        }
    }

    public void Flight_List() {
        System.out.println("1.Rajkot -> Surat");
        System.out.println("2.Junagadh -> Rajkot");
        System.out.println("3.Surat -> Vadoodara");
        System.out.println("4.Surat -> Rajkot");
        System.out.println("5.Vadodara -> Ahmdabad");
    }

    public void selectFlights() throws Exception, InterruptedException {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (Dflight_seats[a - 1] == 0) {
            throw new Exception("No Seats Available");
        } else {

        }
    }

}