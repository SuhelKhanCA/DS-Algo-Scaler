package Six6MonthsOfCode.Day10;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // Get an array
        int arr[] = {2, 55, 88, 56, 45, 5, 99, 52};
        Arrays.sort(arr); // sorting before applying binary search
        int key = 99; // elements to be searched
        System.out.println("The elements 'key' = " + key + " - found at index : " +Arrays.binarySearch(arr, key));
    }
}
