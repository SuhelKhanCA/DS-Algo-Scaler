public class MaximumSumK {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, 3, 4, 5, -1 };
        int k = 4; // constant window size
        System.out.println(findMaxSum(arr, k));
    }

    static int findMaxSum(int[] a, int k) {
        int sum = 0;

        for (int i = 0; i < k-1; i++) {
            sum = sum + a[i];
        }

        int l = 0;
        int r = k-1;

        int MaxSum = 0;

        while (r < a.length-1) {
            sum = sum - a[l];
            l++;
            r++;
            sum = sum + a[r];

            MaxSum = Math.max(sum, MaxSum);
        }

        return MaxSum;
    }
}
