public class elementsInAnArrayAppearsTwiceExceptOne {
    public static void main(String[] args) {

        //Question:

        //Given an array where each element appears twice except one find that element.
        int[] array = {5,2,3,4,5,6,6,7,1,4,3,2,1};
        int sizeOfArray = array.length;
        int xor = 0;

        for(int i = 0; i <= sizeOfArray-1; i++){
            xor = xor^array[i];
        }
        System.out.println(xor);
    }
}
