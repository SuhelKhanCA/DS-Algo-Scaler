import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] a = { 23, 2, 43, 6, 9, 0, 5 };
        
        System.out.println("Before sorting" + Arrays.toString(a));
        Arrays.sort(a); // double pivoted quick sort : O(n^2)
        // use Collections.sort( if time limit exceeded, - merge sort : O(nlogn)
        // works on ArrayList
        System.out.println("After sorting"+Arrays.toString(a));
    }
}
