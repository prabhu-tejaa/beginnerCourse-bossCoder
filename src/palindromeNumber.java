import java.util.*;
public class palindromeNumber {
    public static void main(String[] args){
        System.out.println("Enter a number to check if it's palindrome or not.");
        Scanner input = new Scanner(System.in);
        int userValue = input.nextInt();

        //while loop

//        int originalValue = userValue, reversedNumber = 0;
//        while(userValue!=0){
//            int lastDigit = userValue%10;
//            reversedNumber = (reversedNumber*10) + lastDigit;
//            userValue = userValue/10;
//        }
//        System.out.println("The given value is a " + (reversedNumber == originalValue) + " palindrome.");

        //forloop

        int originalValue, reversedNumber = 0;
        for(originalValue = userValue; userValue != 0; userValue = userValue/10){
            int lastDigit = userValue%10;
            reversedNumber = reversedNumber*10 + lastDigit;
        }
        System.out.println("The given value is a " + (reversedNumber == originalValue) + " palindrome.");
    }
}
