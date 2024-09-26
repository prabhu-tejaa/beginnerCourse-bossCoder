package bitManipulation;

public class xorOfAllNumbersFromOneToN {
    public static void main(String[] args) {

        //Question

        //Find xor of all numbers from 1 to N

        int x = 37;
        int xo = 0;

        for(int i = 1; i<=x;i++){
            xo ^=i;
        }
        System.out.println(xo);





        //rough work

        for(int n = 1; n<=100;n++){
            int xr = 0;
            for(int i =1;i<=n;i++){
                xr ^= i;
            }
            System.out.print(xr + " ");
            if(n%4 == 0){
                System.out.println();
            }
        }

        if(x%4 == 1){
            System.out.println("1");
        } else if (x%4 == 2){
            System.out.println(x+1);
        } else if(x%4 == 3){
            System.out.println("0");
        } else if(x%4 == 4){
            System.out.println(x);
        } else {
            System.out.println();
        }
    }
}
