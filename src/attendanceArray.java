import java.util.Arrays;

public class attendanceArray {
    public static void main(String[] args) {
        int searchNumber = 19;
        int[] array = {1,2,3,4,5,6,9};
        int arraySize = array.length;
        int max = array[0];
        for(int i = 0; i<=arraySize-1;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        boolean[] attendencArray = new boolean[max+1];
        for(int i = 0; i<=arraySize-1;i++){
            attendencArray[array[i]] = true;
        }

        if(searchNumber < 0 || searchNumber > max){
            System.out.println(false);
        } else{
            System.out.println(attendencArray[searchNumber]);
        }

    }
}
