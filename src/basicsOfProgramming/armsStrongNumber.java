package basicsOfProgramming;

import java.util.*;
public class armsStrongNumber {

    static int numberOfDigits(int value){
        int digitsAvaliable = 0;
        while(value!=0){
            value = value/10;
            digitsAvaliable++;
        }
//        for (int i = value; i != 0; i /= 10) {
//            digitsAvaliable++;
//        }
        System.out.println("Digits avaliable: " + digitsAvaliable);
        return  digitsAvaliable;
    }
    static int powerValue(int value, int power){
        int powerOfGivenValue = 1;
        for(int i =1;i<=power;i++){
            powerOfGivenValue = powerOfGivenValue*value;
        }
        System.out.println("power of given value is: " + powerOfGivenValue);
        return powerOfGivenValue;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value to know weather given value is an armstrong or not.");
        int userValue = input.nextInt();
        int numberOfDigits = numberOfDigits(userValue), originalNumber = userValue, armStrongNumber = 0;
        while(userValue!=0){
            int lastDigit = userValue%10;
            armStrongNumber += powerValue(lastDigit, numberOfDigits);
            userValue = userValue/10;
        }
        System.out.println("Armstrong number: " + armStrongNumber);
        System.out.println("The given value is an armstrong: "+ (armStrongNumber == originalNumber));
    }
}
