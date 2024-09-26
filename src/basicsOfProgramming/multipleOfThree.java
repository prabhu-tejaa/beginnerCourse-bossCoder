package basicsOfProgramming;

import java.util.Scanner;
public class multipleOfThree {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get weather a number is multiple of 3");
            System.out.println("Enter the value");
            int firstValue = input.nextInt();
            if(firstValue%3 == 0){
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
