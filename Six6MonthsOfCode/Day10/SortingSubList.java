package Six6MonthsOfCode.Day10;

import java.util.Arrays;

public class SortingSubList {
    public static void main(String[] args) { // sorting the sub-lsit of an array
        // get the array
        int arr [] = {10, 200, 33, 5, 14, 2, 55, 11};
        System.out.println("Integer array : " + Arrays.toString(arr));
         // following code sort() the array using Arrays.sort()
         Arrays.sort(arr, 1, 4);
         System.out.println("Array after sorting the sub-lsit : " + Arrays.toString(arr));
    }
}
