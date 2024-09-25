public class AlternateBit {
    public static void main(String[] args) {
        int n = 0b1010;
        int x =  n ^ (n >> 1);;
        if((x&(x+1)) == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
