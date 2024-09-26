package basics;

import java.util.*;
public class positiveNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to know weather it is positive or not.");
        int userInput = input.nextInt();
        if(userInput > 0) {
            System.out.println(userInput + " is a positive number");
        } else if(userInput < 0) {
            System.out.println(userInput + " is a negative number");
        } else {
            System.out.println(userInput + " is neither a negative or positive number");

        }
    }
}
