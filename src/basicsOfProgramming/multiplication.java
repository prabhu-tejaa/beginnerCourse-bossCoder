package basicsOfProgramming;

import java.util.*;
public class multiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To get the basicsOfProgramming.multiplication of two given values");
        System.out.println("Enter the firstValue");
        int firstValue = input.nextInt();
        System.out.println("Enter the secondValue");
        int secondValue = input.nextInt();
        int multiplication = firstValue * secondValue;
        System.out.println("Multiplication of given value is: " + multiplication);

    }
}
