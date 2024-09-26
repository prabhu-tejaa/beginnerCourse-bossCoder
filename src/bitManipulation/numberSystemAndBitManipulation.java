package bitManipulation;

public class numberSystemAndBitManipulation {
    public static void main(String[] args){
        int n = 21;
        if((n&1) == 0){
            System.out.println("even");
        } else{
            System.out.println("odd");
        }

        System.out.println("left shift - 2^k * x. 8 in binary is 1000 so after left shift binary 100000 - " + (8<<2));
        System.out.println("right shift - x/2^k. After right shift binary 10 - " + (8>>2));

        System.out.println("left shift - 2^k * x. 25 in binary is 11001 so after left shift binary 1100100 - " + (25<<2));
        System.out.println("right shift - x/2^k. After right shift binary 110 - " + (25>>2));
    }
}
