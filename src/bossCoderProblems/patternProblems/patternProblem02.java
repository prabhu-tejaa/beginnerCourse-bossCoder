package bossCoderProblems.patternProblems;

import java.util.*;
public class patternProblem02 {
//    *
//    * *
//    * * *
//    * * * *
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number to the second star pattern.");
        int userValue = input.nextInt();
        for(int i =1; i<= userValue; i++){

            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
