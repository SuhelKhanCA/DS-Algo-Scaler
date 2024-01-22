package Six6MonthsOfCode.Day5;

public class MinimumOfArray {
    public static void main(String[] args) {
        int[] a = {55, 56, 66, 2, 9};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Maximum is : "+ min);
    }
}
