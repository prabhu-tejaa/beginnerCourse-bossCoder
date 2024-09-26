package bossCoderProblems.ifElseConditionalStatements;

import java.util.*;
public class p154_leapYear {
    public static void main(String []args){
        Scanner inputFromTheUser = new Scanner(System.in);
        System.out.println("Enter a value to find out if it's a leap year: ");
        int givenValue = inputFromTheUser.nextInt();
        if(givenValue%400 == 0){
            System.out.println("Leap year");
        } else if(givenValue%100 == 0){
            System.out.println("Is not a Leap year");
        } else if(givenValue%4 == 0){
            System.out.println("Leap year");
        } else {
            System.out.println("Is not a Leap year");
        }
    }
}
