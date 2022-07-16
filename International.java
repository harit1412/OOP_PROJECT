package OOP_PROJECT;

import java.util.Scanner;

public class International implements flight {
    static int Iflight_seats[] = new int[5];

   International()
   {
       for (int i = 0; i < Iflight_seats.length; i++) {
           Iflight_seats[i] = 10;
    }
   }
    @Override
    public void Flight_List() {
        // TODO Auto-generated method stub
        System.out.println("1.Delhi -> USA");
        System.out.println("2.Mumbai -> Germany");
        System.out.println("3.Hydrabad -> Africa");
        System.out.println("4.Ahemdabad -> Dubai");
        System.out.println("5.Chennai -> New-Jersy");
    }

    public void selectFlights() throws Exception {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(Iflight_seats[a-1] == 0)
        {
            throw new Exception("No Seats Available"); 
        }
        else {
            //bookticket 
            //array string
            //
        }
    }

    
   

}
