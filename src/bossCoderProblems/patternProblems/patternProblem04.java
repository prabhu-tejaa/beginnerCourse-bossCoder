package bossCoderProblems.patternProblems;

import java.util.*;
public class patternProblem04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to the 4th star pattern.");
        int userInput = input.nextInt();
        for(int i = 0; i < userInput; i++){
            for(int j = 1; j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
