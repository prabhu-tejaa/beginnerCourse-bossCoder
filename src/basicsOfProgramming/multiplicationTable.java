package basicsOfProgramming;

import java.util.*;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for which you want basicsOfProgramming.multiplication table - ");
        int value = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(value + " x " + i + " = " + (value*i));
        }

        for(int i = 1; i <= 10; i++){
            if(i==6){
                continue;
            } else {
                System.out.println("Without \"6\"" + value + " x " + i + " = " + (value*i));
            }
        }

        for(int i = 1; i <= 10; i++){
            if(i==6){
                break;
            } else {
                System.out.println("Break \"6\"" + value + " x " + i + " = " + (value*i));
            }
        }

    }
}
