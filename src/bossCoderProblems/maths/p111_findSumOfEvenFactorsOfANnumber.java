package bossCoderProblems.maths;

public class p111_findSumOfEvenFactorsOfANnumber {
    public static void main(String[] args) {
        int num = 30;
        int sum =0;
        for(int i = 2; i<=num;i+=2){
            if(num%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
