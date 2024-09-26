package bossCoderProblems.patternProblems;

import java.util.*;
public class patternProblem03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to the 3rd star pattern.");
        int userInput = input.nextInt();
        for(int i = 1; i<= userInput; i++){
            for(char j = 'a'; j < 'a' + i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
