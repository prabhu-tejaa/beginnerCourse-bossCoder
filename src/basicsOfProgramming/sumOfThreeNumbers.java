package basicsOfProgramming;

import java.util.*;
public class sumOfThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("To get the sum of all three numbers");
        System.out.println("Enter your first value");
        int firstValue = input.nextInt();
        System.out.println("Enter your second value");
        int secondValue = input.nextInt();
        System.out.println("Enter your third value");
        int thirdValue = input.nextInt();
        int sumOfThreeValues = firstValue + secondValue + thirdValue;
        System.out.println("Total sum of the three values are: " + sumOfThreeValues);
    }
}
