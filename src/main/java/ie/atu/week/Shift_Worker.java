package ie.atu.week;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Shift_Worker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please enter name ");
            System.out.println("You entered " + input.next());
        } catch (InputMismatchException e) {
            System.out.println(" Error Invalid name");
            System.out.println("Minimum 6 CHARACTERS , Maximum 21 Characters");
        }

        System.out.println("Please enter Gender ");
        System.out.println("You entered " + input.next());


        System.out.println("Please enter Shift  ");
        System.out.println("You entered " + input.nextInt());

        System.out.println("Please enter Age ");
        System.out.println("You entered " + input.nextInt());
    }


}
