package basicsOfProgramming;

import java.util.*;
public class primeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to get get if its prime number or not");
        int userInput = input.nextInt();
        String result = "prime number";
        System.out.println(userInput);
        if(userInput > 1) {
            for (int i = 2; i * i <= userInput; i++) {
                if (userInput % i == 0) {
                    System.out.println("1");
                    result = "not a prime number";
                    break;
                }
            }
        }
        System.out.println("This given input " + userInput + " is a " + result + ".");
    }
}
