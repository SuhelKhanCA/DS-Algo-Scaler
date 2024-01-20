package Lec12;

import java.util.Arrays;

public class ReverseDemo {
    public static void main(String[] args) {
        // case:1 Working with integer array
        Integer[] a1 = {1, 2, 3, 4};
        Reversing1DArrayRecursive<Integer> intA = new Reversing1DArrayRecursive<Integer>(a1);
        intA.reverse1D(4);
        System.out.println(Arrays.toString(a1));

        // Case:2 Working with String array
        String[] s1 = {"AA", "BB", "CC"};
        Reversing1DArrayRecursive<String> strA = new Reversing1DArrayRecursive<>(s1);
        strA.reverse1D(3);
        System.out.println();
        System.out.println(Arrays.toString(s1));
    }
}
