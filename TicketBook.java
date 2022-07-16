package OOP_PROJECT;

import java.util.*;

interface book {
    void Booking();
}

public class TicketBook implements book {

    public void Booking() {

        System.out.println("Number of passengers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<List<String>> person = new ArrayList<List<String>>();
        List<String> info1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.println("First Name : ");
            String first = sc.next();
            // fname.add(first);

            System.out.println("Last Name : ");
            String last = sc.next();
            // fname.add(last);

            System.out.println("Passport Number : ");
            String pass = sc.next();
            // fname.add(pass);

            System.out.println("Age : ");
            String age = sc.next();

            System.out.println("Gender : ");
            String gender = sc.next();

            System.out.println("Departure Date(DD/MM/yyyy) : ");
            String ddate = sc.next();

            List<String> info = new ArrayList<>();
            info.add(first);
            info.add(last);
            info.add(pass);
            info.add(age);
            info.add(ddate);

            info1.addAll(info);

            person.add(info);

        }
     

        for (int i = 0; i < n; i++) {

            System.out.println(person.get(i));

        }
        System.out.println(info1.get(0));

    }
}