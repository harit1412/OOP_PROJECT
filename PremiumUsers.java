package OOP_PROJECT;

public class PremiumUsers extends CheckUser {

    static protected String[] prem = new String[3];
    static {
        
        prem[0] = lst[1][0];
        prem[1] = lst[2][0];
        prem[2] = lst[4][0];

    }

    boolean IsPremiumUsers(String userName) {
        
        for (int i = 0; i < prem.length; i++) {
            if (prem[i].equals(userName)) {
                return true;
            }
        }
        return false;
    }

}
