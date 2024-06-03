import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 233;
//        arr[2] = 1223;
//        arr[3] = 323;
//        arr[4] = 523;
//
//        System.out.println(arr[4]);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int j : arr) {
//            System.out.print(j);
//        }
        int [][] array = new int [3][2];
        for (int row = 0; row <array.length; row++) {
            for(int col=0;col<array[row].length; col++){
                array[row][col] = in.nextInt();
            }

            
        }
    }
}
