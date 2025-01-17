// https://leetcode.com/problems/subarray-sum-equals-k/

public class LongestSubarraySum {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 3, 4, 5, -1 };
        int k = 5;
        System.out.println(findLongestSum(arr, k));
    }

    static int findLongestSum(int[] a, int k) {

        // Brute force
        // int maxlen = 0;
        // for (int i = 0; i < a.length; i++) {
        //     int sum = 0;
        //     for (int j = i+1; j < a.length; j++) {
        //         sum = sum + a[j];

        //         if (sum <= k) {
        //             maxlen = Math.max(maxlen, j - i + 1);
        //         } else if (sum > k) {
        //             break;
        //         }
        //     }
        // }

        
        // optimization
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxlen = 0;

        while (r < a.length-1) {
            sum = sum + a[r];
            //  remove while with if : optimal
            if (sum > k) {
                sum = sum - a[l];
                l++;
            }
            if (sum <= k) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
       
        return maxlen;
    }
}
