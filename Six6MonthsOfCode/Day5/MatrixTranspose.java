package Six6MonthsOfCode.Day5;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
        System.out.println("Original Matrix is :- ");
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = tmp;
            }
        }

        System.out.println("Transpose of Matrix is :- ");
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
    }
}
