package basicsOfProgramming;

import java.util.*;
public class gettingLastDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number to get the last digit");
        int userValue = input.nextInt();
        int lastDigit = userValue%10;
        System.out.println("Last digit is: " + lastDigit);
    }
}
