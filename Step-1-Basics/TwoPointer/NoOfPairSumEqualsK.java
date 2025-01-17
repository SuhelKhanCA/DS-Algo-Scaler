class NoOfPairSumEqualsK { 
    public static void main(String[] args) {
        int arr[] = { 1, 4, 4, 5, 5, 5, 6, 6, 11 };
        int target = 11;
        System.out.println(count(arr, target));
    }

    static int count(int[] a, int tar) {
        int c = 0;

        // Brute Force
        // for (int i = 0; i < a.length; i++) { // O(n^2)
        //     for (int j = i + 1; j < a.length; j++) {
        //         if (a[i] + a[j] == tar) {
        //             c++;
        //         }
        //     }
        // }       

        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if (a[start] + a[end] > tar) {
                end--;
            } else if (a[start] + a[end] < tar) {
                start++;
            } else {
                if (a[start] != a[end]) {

                    // count a[start] --> c1
                    int c1 = 0;
                    int tmp = a[start];
                    while (a[start] != tmp) {
                        start++;
                        c1++;
                    }

                    // count a[end] --> c2
                    int c2 = 0;
                    tmp = a[end];
                    while (a[end] != tmp) {
                        end--;
                        c2++;
                    }
                    
                    c += c1 * c2;
                } else {
                    // end - start +1
                    c += end - start + 1;
                }
            }
        }
        
        return c;
    }
}