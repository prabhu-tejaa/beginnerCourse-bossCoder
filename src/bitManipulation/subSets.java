package bitManipulation;

public class subSets {
    public static void main(String[] args) {

        // subset of any given number is 2^n
        //ex: {2,3,4} - subsets = 2^3 -> 8 possible subsets
        // binary of 0 to 7 elements
//        {1,2,4}
//        to generate in binary use 2^n-1 -> 2^3-1 -> 7
//     index:0,1,2
//        0 = 000
//        1 = 001
//        2 = 010
//        3 = 011
//        4 = 100
//        5 = 101
//        6 = 110
//        7 = 111
        // every single big combination represents a uniques subset

        // 2^n-1 can be written as 1<<n

        // so for bit mask concept if we are isolating o in the bit 110, is 001 and if we are isolating i then its 010, etc,,
        // so do a bit wise & for 110 isolated for 0
        // bit ->       110
        // bitmask -> & 001
        // result ->    000
        // so don't include any number
        // so do a bit wise & for 110 isolated for 1
        // bit ->       110
        // bitmask -> & 010
        // result ->    010
        // so include a[result]
        // so do a bit wise &. ex for 110 isolated for 1
        // bit ->       110
        // bitmask -> & 100        // result ->    100
        // so include a[result]

//        Given an array arr[] of size n, we need to find the sum of all the values that come from XORing all the elements of the subsets.


        int[] array = {1,5,6};
        int arraySize = array.length;
        int sumOfXor = 0;
        for(int i = 0; i < (1<<arraySize); i++){
            int xor = 0;
            for(int j = 0; j<arraySize;j++){
                int bitmask = (1<<j);
                if((i&bitmask) != 0){
                    xor ^= array[j];
                }
            }
            sumOfXor += xor;
        }
        System.out.println(sumOfXor);
    }
}
