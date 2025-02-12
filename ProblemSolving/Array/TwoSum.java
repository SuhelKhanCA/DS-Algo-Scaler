package ProblemSolving.Array;
// https://leetcode.com/problems/two-sum/description/
import java.util.Arrays;
import java.util.HashMap;

class Pair {
    int i;
    int j;

    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class TwoSum { // Indexes, of two elements having sum = target given

    // Brute-force  O(n^2)
    public static Pair findIndx(int[] a, int tar) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == tar) {
                    return new Pair(i, j);
                }
            }
        }
        return new Pair(-1, -1);
    }

    // Using HashMap : O(n)
    public static void findIndx2(int[] arr, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sno = target - arr[i];
            if (map.containsKey(sno)) {
                ans[0] = map.get(sno);
                ans[1] = i;
                break;
            }
            map.put(arr[i], i);
        }

        System.out.println("Indexes : " + Arrays.toString(ans));

    }
    public static void main(String[] args) {
        int arr[] = {11, 3, 7,9, 14, 2};
        int target = 17;
        Pair ans2 = findIndx(arr, target);
        System.out.println("Indices are : "+ ans2.i + ", " + ans2.j);
        
        findIndx2(arr, target);
    }
}