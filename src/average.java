import java.util.Scanner;
public class average {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get the average sum of two given values");
            System.out.println("Enter the firstValue");
            int firstValue = input.nextInt();
            System.out.println("Enter the secondValue");
            int secondValue = input.nextInt();
            int average = (firstValue + secondValue)/2;
            System.out.println("average of given value is: " + average);
        }
    }
