package bossCoderProblems.ifElseConditionalStatements;

import java.util.*;
public class p89_evenOrOdd {
    public static void main(String[] args){
//        int value = 7;
        Scanner inputFromUser = new Scanner(System.in);
        System.out.println("Enter a value to get odd or even: ");
        int givenUserInput = inputFromUser.nextInt();
        if(givenUserInput%2 == 0){
            System.out.println("Given number is " + givenUserInput + " - is even");
        } else {
            System.out.println("Given number " + givenUserInput + "  - is odd:");
        }
    }
}
