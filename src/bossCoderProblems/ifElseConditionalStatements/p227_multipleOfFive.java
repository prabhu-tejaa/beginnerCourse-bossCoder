package bossCoderProblems.ifElseConditionalStatements;
import java.util.*;
public class p227_multipleOfFive {
    static int[] multipleOfFive(int input){
        int[] arrayForGivenInput = new int[input/5];
        for(int i = 5, j = 0; i <= input; i=i+5){
            arrayForGivenInput[j++] = i;
        }
        return arrayForGivenInput;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to which you want to print all the numbers which are multiples of 5.");
        int userInput = input.nextInt();
        System.out.println(Arrays.toString(multipleOfFive(userInput)));
    }
}
