package Six6MonthsOfCode.Day10;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) { // sorting an array using sort() method
        // get an array
        int[] arr = {55, 12, 56, 444, 23, 66};
        System.out.println("Given int array is : " + Arrays.toString(arr));
        // the following code sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array is :  " + Arrays.toString(arr));
    }
}
