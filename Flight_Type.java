package OOP_PROJECT;

import java.util.*;

public class Flight_Type {

    void Select_Type() throws Exception {

        System.out.println("\n==============================================================\n");
        System.out.println("------ CHOOSE THE SUITABLE FLIGHT TYPE ------");
        System.out.println("1. Domestic");
        System.out.println("2. International");
        
        Scanner sc = new Scanner(System.in);
        int choose_type = sc.nextInt();
        if (choose_type == 1) {
            Domestic obj = new Domestic();
            obj.Domestics();
        } else if (choose_type == 2) {
            International obj2 = new International();
            obj2.Internationals();
        } else {
            throw new Exception("Enter a valid choice.");
        }

    }

}
