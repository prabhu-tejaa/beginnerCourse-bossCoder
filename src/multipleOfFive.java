import java.util.Scanner;

public class multipleOfFive {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("To get values multiple of 5");
            System.out.println("Enter the value");
            int value = input.nextInt();
            for(int i = 5; i<=value; i=i+5){
                    System.out.println("Multiple of 5 is: "+i);
            }
        }
    }
