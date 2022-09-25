import java.lang.reflect.Array;
import java.util.ArrayList;

class Main{
//SOLİD

    public static void main(String[] args) {

        ArrayList<creditManager> credits=new ArrayList<creditManager>();
        credits.add(new mortgageManager());
        credits.add(new vehicleManager());

        for (creditManager credit:credits) {
            credit.calculate();

        }
    }






}