class SumEqualsK { // Brute Force
    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 5, 5, 5, 6, 6, 11 };
        int target = 11;
        System.out.println(count(arr, target));
    }

    static int count(int[] a, int tar) {
        int c = 0;

        // for (int i = 0; i < a.length; i++) { // O(n^2)
        //     for (int j = i + 1; j < a.length; j++) {
        //         if (a[i] + a[j] == tar) {
        //             c++;
        //         }
        //     }
        // }

        

        return c;
    }
}