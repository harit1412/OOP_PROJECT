package OOP_PROJECT;

import java.util.*;

public class Flight_Type extends Loading {

    void Select_Type() throws Exception {

        load();

        System.out.println("\n");
        System.out.println("\n==============================================================\n");
        System.out.println("\n--------------------------------------------");
        System.out.println("------ CHOOSE THE SUITABLE FLIGHT TYPE ------");
        System.out.println("--------------------------------------------\n");

        System.out.println("1. Domestic Flights");
        System.out.println("2. International Flights");

        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose the flight type : ");
        int choose_type = sc.nextInt();
        if (choose_type == 1) {

            Domestic dom = new Domestic();
            dom.Domestics();

        } else if (choose_type == 2) {

            International inti = new International();
            inti.Internationals();

        } else {
            throw new Exception("\nEnter a valid choice.");
        }

    }

}
