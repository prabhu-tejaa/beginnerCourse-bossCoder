package bossCoderProblems.ifElseConditionalStatements;

import java.util.Scanner;
public class p189_maximum {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get the max of two numbers");
            System.out.println("Enter your first value");
            int firstValue = input.nextInt();
            System.out.println("Enter your second value");
            int secondValue = input.nextInt();
            if(firstValue > secondValue){
                System.out.println("Maximum number is: " + firstValue);
            } else {
                System.out.println("Maximum number is: " + secondValue);
            }
        }
    }
