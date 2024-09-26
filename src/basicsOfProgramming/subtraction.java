package basicsOfProgramming;

import java.util.Scanner;
public class subtraction {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get the basicsOfProgramming.subtraction of two given values");
            System.out.println("Enter the firstValue");
            int firstValue = input.nextInt();
            System.out.println("Enter the secondValue");
            int secondValue = input.nextInt();
            int subtraction = firstValue - secondValue;
            System.out.println("Subtraction of given value is: " + subtraction);

        }
}
