package OOP_PROJECT;

public class TicketPrint extends TicketBook {
    void Print(int n,String first[] ,String last[] ,String pass[],String age[],String gender[],String ddate[]) {
        System.out.println("==================================================");
        System.out.println("--------------------- TICKET ---------------------");
        System.out.println("==================================================");

        for (int i = 0; i < n; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Passanger : " +i);
            System.out.println("Name : " +first[i] + " " +last[i]); 
            System.out.println("Passport Number : " +pass[i]);
            System.out.println("Age : " +age[i]);
            System.out.println("Gender : " +gender[i]);
            System.out.println("Departure Date : " +ddate[i]);
            System.out.println("---------------------------------------");

            System.out.println("Total amount to be paid : ");
            
        }
    }
}