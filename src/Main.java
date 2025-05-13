import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double[] arr_val = new double[3];
        String[] arr_unit = new String[3];
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if(i < 2) {
                System.out.print("Enter the value of mass of " + (i + 1) + ": ");
            }else {
                System.out.print("Enter the value of distance: ");
            }
            arr_val[i] = cin.nextDouble();
        }
        for (int i = 0; i < 3; i++) {
            if(i < 2) {
                System.out.print("Enter the unit of mass of " + (i + 1) + ": ");
            }else {
                System.out.print("Enter the unit of distance: ");
            }
            arr_unit[i] = cin.next();
        }




        Gravity gravity = new Gravity(arr_val, arr_unit);
        gravity.Formula();

        cin.close();
    }
}
