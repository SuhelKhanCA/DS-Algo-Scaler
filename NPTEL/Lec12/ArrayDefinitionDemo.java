/*The following program explains the various way of declaring and initializing an array */
package Lec12;
import java.util.Arrays;

public class ArrayDefinitionDemo {
    public static void main(String[] args) {
        float x[];
        x = new float[100];
        args  = new String[10];
        boolean[] isPrime = new boolean[1000];
        int[] fib = {0, 1, 1, 2, 3, 5, 8, 13};
        short[][][] b = new short[4][10][5];
        double[][] a = {{1.1, 2.2}, {3.3, 4.4}, null, {5.5, 6.6}, null};
        a[4] = new double[66];
        a[4][65] = 3.14;

        Object[] objects = {x, args, isPrime, fib, b, a};
        //System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(objects));
        // for (int i = 0; i < a.length; i++) {
        //     if (a[i] != null) {
        //         for (int j = 0; j < a[i].length; j++) {
        //             System.out.print(a[i][j] + " ");
        //         }
        //         System.out.println();
        //     } else {
        //         System.out.println("null");
        //     }
        // }
        // for (Object object : objects) {
        //     System.out.println(Arrays.toString(objects));
        // } This prints addresses of the elements
        
        // for (int i = 0; i < objects.length; i++) {
        //     System.out.println(objects[i]);
        // } this too prints the address
        
    }
}
