package Review;

/**
 * Created by averychen on 5/14/17.
 */
public class SwitchCase {
    public static void main(String args[]){
        int iSwitch=4;
        switch(iSwitch){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            default:
                System.out.println("Not in the list");
                break;
        }
    }
}
