public class arrays {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(array[3]);
        // update
        array[3] = 7;
        System.out.println(array[3]);

        int[] fixedArray = new int[3];
        fixedArray[0] = 0;
        fixedArray[1] = 1;
        fixedArray[2] = 2;
        System.out.println(fixedArray[0]);
        System.out.println(fixedArray[1]);
        System.out.println(fixedArray[2]);
    }
}
