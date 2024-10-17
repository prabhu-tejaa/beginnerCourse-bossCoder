package exam01;
import java.util.*;
public class practiseLoops {
    public static void main(String[] args) {

        //01 palindrome number - 12321 -> true, 123 -> false

        // int num = 12321;
        // System.out.println(num%10);
        // System.out.println(num/10);
        // System.out.println((num*10)+9);

        // int originalNum = num, reversedNum = 0;
        // while(num!=0){
        //     int lastDigit = num%10;
        //     reversedNum = (reversedNum*10) + lastDigit;
        //     num = num/10;
        // }
        // System.out.println(reversedNum == originalNum);

        // 02 lenght of last string

        // String word = "Universe I LOVE YOU ";
        // int length = 0;
        // int lenghtOfString = word.length()-1;
        // while (lenghtOfString >= 0 && word.charAt(lenghtOfString) == ' ') {
        //     lenghtOfString--;
        // }
        // while(lenghtOfString >= 0 && word.charAt(lenghtOfString) != ' '){
        //     length++;
        //     lenghtOfString--;
        // }
        // System.out.println(length);

        // real practise back to 1 and 2nd question

        // palindrome

        // int num = 137;
        // int originalNum = num, reversedNum = 0;
        // while(num!=0){
        //     int lastDigit = num%10;
        //     reversedNum = (reversedNum*10)+lastDigit;
        //     num = num/10;
        // }
        // System.out.println(reversedNum==originalNum);

        // length of last string

        // String word = "Happy birthday Meghana ";
        // int length = 0;
        // int sizeOfString = word.length()-1;
        // while(sizeOfString >= 0 && word.charAt(sizeOfString) == ' '){
        //     sizeOfString--;
        // }
        // while ((sizeOfString >= 0 && word.charAt(sizeOfString) != ' ')) {
        //     length++;
        //     sizeOfString--;
        // }
        // System.out.println(length);

        // 03 multiple of 5

        // int num = 30;
        // int[] answer = new int[num/5];
        // for(int i = 5,j=0; i<=num;i=i+5){
        //     answer[j++]=i;
        // }
        // System.out.println(Arrays.toString(answer));

        // 04 odd number sum

        // int num = 3;
        // int oddNumSum = num*num;
        // System.out.println(oddNumSum);

        // 04 another variant, even number sum

        // int num = 3;
        // int evennNumberSum = num*(num+1);
        // System.out.println(evennNumberSum);

        // 05 factorial of a number -> 5 = 5x4x3x2x1

        // int num = 5;
        // int factorial = 1;
        // for(int i = 2; i<=num;i++){
        //     factorial*=i;
        // }
        // System.out.println(factorial);

        // 06 prime number

        // int num = 5;
        // if(num < 2){
        //     System.out.println(false + "is not a prime number");
        // }
        // if(num == 2){
        //     System.out.println(true+"is a prime number");
        // }
        // if(num%2 == 0){
        //     System.out.println(true+"is not a prime number");
        // }
        // for(int i = 3;i*i<=num;i+=2){
        //     if(num%i==0){
        //         System.out.println(true+"is a prime number");
        //     }
        // }
        // System.out.println(false+"is not a prime number");

        // practising prime numbers

        // int num = 37;
        // if(num < 2){
        //     System.out.println("It is not a prime number");
        // }
        // if(num == 2){
        //     System.out.println("It is a prime number");
        // }
        // if(num%2 == 0){
        //     System.out.println("It is not a prime number");
        // }
        // for(int i =3;i*i<num;i++){
        //     if(num%i==0){
        //         System.out.println("It is a prime number");
        //     }
        // }
        // System.out.println("It is not a prime number");

        // 07 armstrong number

        // int num = 371;
        // int originalNumber = num, armstrongNumber = 0, lastDigit = 0, noOfDigits = 0;
        // for(int i = num; i!=0;i/=10){
        //     noOfDigits++;
        // }
        // for(int i =0;i<noOfDigits;i++){
        //     lastDigit = originalNumber%10;
        //     int totalPower = 1;
        //     for(int j = 1;j<=noOfDigits;j++){
        //         totalPower *= lastDigit;
        //     }
        //     armstrongNumber+=totalPower;
        //     originalNumber/=10;
        // }
        // System.out.println(armstrongNumber);
        // System.out.println(armstrongNumber == num);

        // int num = 371;
        // int originalNum = num, lastDigit = 0, noOfDigits = 0, armstrongNumber = 0;
        // for(int i = num;i!=0;i/=10){
        //     noOfDigits++;
        // }
        // for(int i = 0; i<noOfDigits;i++){
        //     lastDigit = originalNum%10;
        //     int power = 1;
        //     for(int j =0;j<noOfDigits;j++){
        //         power*=lastDigit;
        //     }
        //     armstrongNumber+=power;
        //     originalNum/=10;
        // }
        // System.out.println(armstrongNumber==num);
    }
}
