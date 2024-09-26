package bossCoderProblems.maths;
import java.util.*;
public class p99_findGCD {
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args) {

        // gcd formula = gcd(b,a-b) that means, gcd(24,6)-> gcd(6, (difference = 24-6) 18) -> gcd(6, (difference = 18-6) 12) -> gcd(6, (difference = 12-6) 6) -> gcd(6,6) = 6
        // the formula, gcd(a,b) = gcd(b,a%b) -> where b is smaller number in the gcd
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your gcd values: ");
        int gcdA = input.nextInt();
        int gcdB = input.nextInt();
        System.out.println("("+gcdA+", " + gcdB+")");
        System.out.println("GCD of given numbers is: " + gcd(gcdA,gcdB));

    }
}
