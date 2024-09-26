package bossCoderProblems.loops;

import java.util.*;
public class p93_factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to get it's basicsOfProgramming.factorial.");
        int userInput = input.nextInt();
        int factorial = 1;
        for(int i = 2; i <= userInput; i++){
            factorial = factorial*i;
        }
        System.out.println("The basicsOfProgramming.factorial of the given number" + userInput + "is: " + factorial);
    }
}
