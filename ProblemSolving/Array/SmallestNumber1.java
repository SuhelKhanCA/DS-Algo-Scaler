package ProblemSolving.Array;
// https://www.geeksforgeeks.org/problems/digit-multiplier3000/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Arrays;

public class SmallestNumber1 {

    static void findSmallest(int n) {
        int hash[] = new int[10];

        for (int i = 9; i > 1; i--) {
            while (n % i == 0 && n > 0) {
                hash[i]++;
                n = n / i;
            }
        }
        System.out.println(Arrays.toString(hash));

        int num = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                while (hash[i] > 0) {
                    num = num * 10 + i;
                    hash[i]--;
                }
            }
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        int N = 81000;
        findSmallest(N);
    }
}
