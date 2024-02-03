package Six6MonthsOfCode.Day10;

import java.util.Arrays;

public class BinarySubList {
    public static void main(String[] args) { // Searching an elements in the array sublist
        int[] arr2 = {100, 200, 33, 66, 88, 99, 120}; // get an array
        Arrays.sort(arr2); // sorting before searching
        int key = 66; // elements to be searched
        System.out.println("Sorted array is : " + Arrays.toString(arr2));
        System.out.println("The elements 'key' = " + key + " - found at index : " +Arrays.binarySearch(arr2, 1, 3, key));
    }
}
