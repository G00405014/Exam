package ie.atu.week;

import java.util.InputMismatchException;
import java.util.Scanner;

//Name: Emeka
//Student id: G00405014
//Date: 12/12/22

public class Shift_Worker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Please enter name ");
            System.out.println("You entered " + input.next());
        } catch (InputMismatchException e) {
            System.out.println(" Error Invalid name type ");
            System.out.println("Minimum 6 CHARACTERS , Maximum 21 Characters");
        }
        try {
            System.out.println("Please enter Gender ");
            System.out.println("You entered " + input.next());
        } catch (InputMismatchException e) {
            System.out.println(" Error Invalid Gender");
            System.out.println("Please select one of the following\n Man\n Woman\n Non Binary\n ");
        }
        try {
            System.out.println("Please enter Shift  ");
            System.out.println("You entered " + input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error invalid shift ");
            System.out.println("Please enter either day or night shift");
        }
        try {
            System.out.println("Please enter Age ");
            System.out.println("You entered " + input.nextInt());

        } catch (NumberFormatException e) {
            ;
            System.out.println("Error Invalid age ");
            System.out.println("Please enter a valid age\n age must be above 18");
        }

    }
}
