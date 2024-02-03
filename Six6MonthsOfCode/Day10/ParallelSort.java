package Six6MonthsOfCode.Day10;

import java.util.Arrays;

public class ParallelSort {
    public static void main(String[] args) {
        // get the array
        int arr[] = {55, 20, 65, 11, 1, 0};
        System.out.println("Integer Array is : " + Arrays.toString(arr));
        // to sort the array using the Arrays.parallelSort() method
        Arrays.parallelSort(arr);
        System.out.println("Arrays after sorting : " + Arrays.toString(arr));
    }
}
