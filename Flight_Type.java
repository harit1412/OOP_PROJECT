package OOP_PROJECT;
import java.util.*;

public class Flight_Type {

    void Select_Type() throws Exception {
        System.out.println("1.Domestic");
        System.out.println("2.International");
        Scanner sc = new Scanner(System.in);
        int choose_type = sc.nextInt();
        if (choose_type == 1) {

        } else if (choose_type == 2) {

        } else {
            throw new Exception("Enter a valid choice.");
        }
        
    }

}
