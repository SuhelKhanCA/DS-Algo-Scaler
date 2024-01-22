package Six6MonthsOfCode.Day5;

public class SubArraysOfArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 6, 5, 4};
       // int si = 0;
       // int ei = 0;
        for (int si = 0; si < a.length; si++) {
            for (int ei = si; ei < a.length; ei++) {
                for (int i = si; i < ei; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
            //System.out.println();
        }
    }
}
