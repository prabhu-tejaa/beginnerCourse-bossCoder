package basicsOfProgramming;

import java.util.*;
public class concatTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int firstValue = input.nextInt();
        System.out.println("Enter second value: ");
        int secondValue = input.nextInt();
        int contactingTwoValues = (firstValue * 10) + secondValue;
        System.out.println("The value after concatenating fist value and second value is: " + contactingTwoValues);
    }
}
