import java.util.Scanner;
public class remainder {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get the remainder of two given values");
            System.out.println("Enter the firstValue");
            int firstValue = input.nextInt();
            System.out.println("Enter the secondValue");
            int secondValue = input.nextInt();
            int remainder = firstValue % secondValue;
            System.out.println("remainder of given value is: " + remainder);
        }
    }
