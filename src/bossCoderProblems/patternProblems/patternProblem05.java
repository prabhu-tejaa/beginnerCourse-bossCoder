package bossCoderProblems.patternProblems;

import java.util.*;
public class patternProblem05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to the 5th star pattern.");
        int userInput = input.nextInt();
        for(int i = 0; i < userInput ; i++){
            for(int j = 0; j < userInput - i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
