package basics;

public class PowerOfTwo {
    public static void main(String[] args) {

//        bits of numbers
//        0  -  00000
//        1  -	00001
//        2  -	00010
//        3  -	00011
//        4  -	00100
//        5  -	00101
//        6  -	00110
//        7  -	00111
//        8  -	01000
//        9  -	01001
//        10 -	01010
//        11 -	01011
//        12 -	01100
//        13 -	01101
//        14 -	01110
//        15 -	01111
//        16 -	10000
//        17 -	10001
//        18 -	10010
//        19 -	10011
//        20 -	10100
//        21 -	10101
//        22 -	10110
//        23 -	10111
//        24 -	11000
//        25 -	11001
//        26 -	11010
//        27 -	11011
//        28 -	11100
//        29 -	11101
//        30 -	11110
//        31 -	11111
//        32 -	100000

        // if you see the pattern, you can see that all the powers of 2 are having 1 set bits. like check 2,4,8,16,32...
        // something like 10. 100. 1000. 10000
        // from this we can derive a formula like:
        //  n&(n-1)
        // that is: 01000 & (00111) -> 00000 because we are doing & bitwise operator
        // if you see only for the powers of 2 this pattern is there.
        // if(n&(n-1) == 0){ return true}

//        int input = 32;
        int input = 5;
        if((input&(input-1)) == 0){
            System.out.println("The given number is a power of 2");
        } else {
            System.out.println("The given number is not a power of 2");
        }
    }

}
