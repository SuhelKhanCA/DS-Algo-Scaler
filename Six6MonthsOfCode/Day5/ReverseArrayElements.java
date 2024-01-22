package Six6MonthsOfCode.Day5;

import java.util.Arrays;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int left  = 0;
        int right = arr.length -1;

        System.out.println("Original array is : " + Arrays.toString(arr));
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        System.out.println("Reversed array is :" + Arrays.toString(arr));
    }
}
