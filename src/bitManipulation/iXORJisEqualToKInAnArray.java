package bitManipulation;

public class iXORJisEqualToKInAnArray {
    public static void main(String[] args) {

        //question-

        // given an array userArray and an integer searchNumber. Find if there exists i,j such that userArray[i] ^ userArray[j] = searchNumber;

        int[] userArray = {5,3,1,9,2};
        int sizeOfArray = userArray.length;
        int searchNumber = 3;

        int max = userArray[0];
        for(int i = 0; i<=sizeOfArray-1;i++){
            if(userArray[i]>max){
                max=userArray[i];
            }
        }

        boolean[] attendence = new boolean[max+1];
        for(int i=0;i<=sizeOfArray-1;i++){
            attendence[userArray[i]]=true;
        }

        for(int i = 0; i<=sizeOfArray-1;i++){
            if(searchNumber >= userArray[i] && (searchNumber^userArray[i]) <= max && attendence[searchNumber^userArray[i]]){
                System.out.println(searchNumber^userArray[i]);
            }
        }
    }
}
