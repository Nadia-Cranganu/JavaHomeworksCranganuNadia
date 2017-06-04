/*
 * Build of a simple calculator
 */

package SimpleCalculator;

import java.util.Scanner;
/*
 * @author Nadia
 */

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("Functions:");
        
        System.out.println("           1. Addition");
        System.out.println("           2. Subtraction");
        System.out.println("           3. Division");
        System.out.println("           4. Multiplication");

        System.out.print("What function do you need to perform?: ");
        int choice = input.nextInt();
        System.out.println();


        if (choice == 1){
            addition();
        }
        else if (choice == 2){
            subtraction();
        }
        else if (choice == 3){
            division();
        }
        else if (choice == 4){
            multiplication();
        }

        System.out.println();
        input.close();
    }

    public static void addition(){

        int One, Two;
        Scanner input = new Scanner(System.in);

        System.out.println("Addition");

        System.out.print("First Number: ");
        One = input.nextInt();

        System.out.print("Second Number: ");
        Two = input.nextInt();

        input.close();
        System.out.println("Result: " + One + " + " + Two + " = " + (One + Two));
    }

    public static void subtraction(){
        int One, Two;
        Scanner input = new Scanner(System.in);

        System.out.println("Subtraction");

        System.out.print("First Number: ");
        One = input.nextInt();

        System.out.print("Second Number: ");
        Two = input.nextInt();

        input.close();
        System.out.println("Result: " + One + " - " + Two + " = " + (One - Two));
    }

    public static void division(){
        int One, Two;
        Scanner input = new Scanner(System.in);

        System.out.println("Division");

        System.out.print("First Number: ");
        One = input.nextInt();

        System.out.print("Second Number: ");
        Two = input.nextInt();

        input.close();
        System.out.println("\nResult: " + One + " / " + Two + " = " + (One / Two));
    }

    public static void multiplication(){
        int One, Two;
        Scanner input = new Scanner(System.in);

        System.out.println("Multiplication");

        System.out.print("\nFirst Number: ");
        One = input.nextInt();

        System.out.print("\nSecond Number: ");
        Two = input.nextInt();

        input.close();
        System.out.println("\nResult: " + One + " x " + Two + " = " + (One * Two));
    }
}
    

