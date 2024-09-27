package leetCode;

public class p1295_findNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int answer = 0;
        for(int i:nums){
            if((i>=10 && i<=99) || (i>=1000 && i<=9999) || (i==100000)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
