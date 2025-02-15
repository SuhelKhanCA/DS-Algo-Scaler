package ProblemSolving.Array;
// https://leetcode.com/problems/3sum/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    // Brute-force : O(n^3)
    // SC : O(1)
    static int[] findTriplets(int[] a, int tar) {
        Set<String> set = new HashSet<>(); // To avoid repeted elements
        int[] ans = new int[3];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == tar && !set.contains(a[i] + "" + a[j] + "" + a[k])) {
                        ans[0] = a[i];
                        ans[1] = a[j];
                        ans[2] = a[k];
                        set.add(a[i] + "" + a[j] + "" + a[k]);
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
    // Using Hashmap - Optimization 1
    // T.C : O(n^2)
    // SC : O(n) + O(m)

    

    // Two pointer - Optimization 2
    // nlogn + O(n^2)
    // S.C : O(1)
    static List<List<Integer>> sol(int[] a, int target, int n) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (i == 0 || a[i] != a[i - 1]) {
                int j = i + 1;
                int k = n - 1;

                int tar = target - a[i];

                while (j < k) {
                    if (a[j] + a[k] == tar) {
                        // System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        list.add(new ArrayList<>(Arrays.asList(a[i], a[j], a[k])));
                        while (j < k && a[j] == a[j + 1])
                            j++;
                        while (j < k && a[k] == a[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {11, 3, 7,9, 14, 2};
        int target = 12;
        // System.out.println(Arrays.toString(findTriplets(arr, target)));
        
        // Two pointer
        // sol(arr, target, arr.length);
        System.out.println(sol(arr, target, arr.length));
    }
}
