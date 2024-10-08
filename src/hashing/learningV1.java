package hashing;

public class learningV1 {
    public static void main(String[] args){
        int[] array = {15, -2, 2, -8, 1, 7, 10, 23};
        int sizeOfArray = array.length,answer = 0;
        for(int i = 0; i<sizeOfArray;i++){
            int sum = 0;
            for(int j = i;j<sizeOfArray;j++){
                sum += array[j];
                if(sum == 0){
                    int cuurentLength = j-i+1;
                    if(cuurentLength > answer){
                        answer = cuurentLength;
                    }
                }
            }
        }
        System.out.println(answer);
    }
    
}
