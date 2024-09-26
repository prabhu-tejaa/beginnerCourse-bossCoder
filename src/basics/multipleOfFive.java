package basics;

import java.util.Scanner;

public class multipleOfFive {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get values multiple of 5");
            System.out.println("Enter the value");
            int value = input.nextInt();
            if(value < 5) {
                System.out.println("The value is less than 5 so it is not possible to get the multiples of 5 for the value: " + value);
            } else {
                System.out.println("The multiple of 5 is: ");
                for(int i = 5; i<= value; i = i +5){
                    System.out.println(i);
                }
            }
        }
    }
