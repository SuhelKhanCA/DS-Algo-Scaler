package Six6MonthsOfCode.Day5;

import java.util.Arrays;

public class Rotate2DClockwise90 {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        System.out.println("Original Matrix is :- ");
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
        // first take transpose
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }
        // rotate by 90
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
                
        //     }
        // }
        int left  = 0;
        int right = a[0].length - 1;
            for (int i = 0; i < a[0].length; i++) {
                while (left < right) {
                    int tmp = a[i][left];
                    a[i][left] = a[i][right];
                    a[i][right] = tmp;
                    left++;
                    right--;
                }
            }
        System.out.println("Clockwise 90 degree rotated Matrix is :- ");
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
    }
}
