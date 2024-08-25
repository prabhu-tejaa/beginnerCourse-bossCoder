import java.util.*;
public class addTwoNumbers {
        public static void main(String[] args) {
            int firstNumber = 3;
            int secondNumber = 7;
            int sum = firstNumber+secondNumber;
            System.out.print("Addition of two number 3+7 = " + sum);

            Scanner inputFromUser = new Scanner(System.in);
            System.out.print("Enter first number: ");

            int firstInputFromUser = inputFromUser.nextInt();
            System.out.print("Enter second number: ");

            int secondInputFromUser = inputFromUser.nextInt();
            int AddingOfTwoInputValues = firstInputFromUser+ secondInputFromUser;
            System.out.println("The sum of your numbers = " + AddingOfTwoInputValues);
        }
}
