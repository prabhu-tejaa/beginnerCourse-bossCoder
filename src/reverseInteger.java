import java.util.Scanner;
public class reverseInteger {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number to reverse it: ");
            int userInput = input.nextInt();
            int reversedVale = 0;
            while(userInput!=0){
                int lastDigit = userInput%10;
                reversedVale = (reversedVale*10)+lastDigit;
                userInput = userInput/10;
            }
            System.out.println("Reversed value is: " + reversedVale);
        }
    }
