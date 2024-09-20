import java.util.*;
public class armStringNumber01 {

    //understanding:
    // first break the problem, armstrong number means n digit number equal to the sum of the nth powers of their digits
    // that means 371 = total 3 digits, so 3^3+7^3+1^3
    // so here lets break it, first see the number and understand what to do...
    //so based on the given statement on what is armstrong, it's an adding of all the digits with its power rite.
    // so first to need to get how many digits are there so that you can get how much power you need and that can be known with a loop of n/10
    // then you need to get each individual digits so that you can do power of the number, so here we can know the last digit by n%10, we will ge the last digit
    // then all you need to is break the get the last number and power it and then add and check if its == to original number
    // think and think always. Find ways, break it down to the tiniest thing always.
    // Wish you luck my dear soul <3 Love yaaa...


    static int noOfInputValues(int userValue){
        int noOfValues = 0;
        for(int i = userValue; i!=0; i=i/10){
            noOfValues++;
        }
        return noOfValues;
    }

    static int power(int number, int power){
        int result = 1;
        for(int i = 1; i<= power; i++){
            result *= number;
        }
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value for which you wanna know weather it is an Armstrong number.");
        int valueFromUser = input.nextInt();
        int userInput = valueFromUser;
        int numberOfValues = noOfInputValues(userInput);
        int arm = 0;
        int lastDigit = 0;
        for(int i = 1; i<=numberOfValues; i++){
            lastDigit = userInput%10;
            arm += power(lastDigit,numberOfValues);
            userInput = userInput/10;
        }
        System.out.println(arm);
        System.out.println(arm==valueFromUser);

    }
}
