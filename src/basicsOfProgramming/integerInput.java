package basicsOfProgramming;

import java.util.*;
public class integerInput {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the integer input you want to return: ");
    int integerValue = input.nextInt();
        System.out.println("Return value of integer is: " + integerValue);
    }
}
