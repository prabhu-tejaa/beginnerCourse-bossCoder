import java.util.Arrays;

public class checkIfAValueIsPresentInAnArray {
    public static void main(String[] args) {
        int[] array = {1,3,7};
        int sizeOfArray = array.length;
        int value = 7;
        for(int i = 0; i <= sizeOfArray-1; i++){
            if(array[i] == value){
                System.out.println("Hello universe");
            }
        }
    }
}
