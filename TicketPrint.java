package OOP_PROJECT;

public class TicketPrint extends TicketBook {
    static {
        System.out.println("==================================================");
        System.out.println("--------------------- TICKET ---------------------");
        System.out.println("==================================================");

    }
    int total_amount;

    void Print(int n, String first[], String last[], String pass[], String age[], String gender[], String ddate[],
            int a, int f) {

        if (a == 0) {
            total_amount = n * (Dflight.Dflight_price[f - 1]);
        }
        if (a == 1) {
            total_amount = n * (Inflight.Inflight_price[f - 1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Passanger : " + (i + 1));
            System.out.println("Name : " + first[i] + " " + last[i]);
            System.out.println("Passport Number : " + pass[i]);
            System.out.println("Age : " + age[i]);
            System.out.println("Gender : " + gender[i]);
            System.out.println("Departure Date : " + ddate[i]);
            System.out.println("---------------------------------------");

        }
        LogIn ob = new LogIn();
        PremiumUsers ob2 = new PremiumUsers();
        // System.out.println(ob2.IsPremiumUsers(ob.Username));
        // System.out.println(LogIn.Username);
        if (ob2.IsPremiumUsers(LogIn.Username)) {
            System.out
                    .println("Total amount to be paid [20% Discounted :)] : " + (total_amount - (total_amount * 0.2)));
        } else {

            System.out.println("Total amount to be paid : " + total_amount);
        }

    }

    // void PrintListForAdmin(int n, String first[], String last[], String pass[],
    // String age[], String gender[], String ddate[]){
    // for(int i = 0; i < n; i++){

    // }
    // }
}