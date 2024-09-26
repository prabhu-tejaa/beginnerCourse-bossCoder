package arrays;

public class greatestNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int sizeOfArray = array.length;
        int max = array[0];
        for(int i =0; i<=sizeOfArray-1;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
