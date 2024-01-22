//package 6MonthsOfCode.Day5;

public class MaximumOfArray {
    public static void main(String[] args) {
        int[] a = {55, 56, 66, 2, 9};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum is : "+ max);
    }
}
