import java.util.Scanner;

public class removingLastDigit {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number to remove last digit");
            int userValue = input.nextInt();
            int lastDigit = userValue/10;
            System.out.println("Value of last digit is: " + lastDigit);
        }
    }
