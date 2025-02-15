// https://leetcode.com/problems/majority-element/

import java.util.HashMap;

class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 4, 7, 4, 3, 4, 4, 7, 4, 4 };
        // int ans = findMajority(arr);
        // System.out.println(ans);

        // System.out.println(findMajorityOptimize(arr));
        
        System.out.println(findMajorityOptimized(arr));
    }

    // Brute-force : O(n^2)
    static int findMajority(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int freq = findFreq(a, a[i]);
            if (freq > a.length / 2) {
                return a[i];
            }
        }
        
        return -1;
    }

    static int findFreq(int[] a, int tar) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == tar) {
                c++;
            }
        }

        return c;
    }

    // Optimization
    // T.C : O(n)
    // S.C : O(n)
    static int findMajorityOptimize(int[] a) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (!hm.containsKey(a[i])) {
                hm.put(a[i], 1);
            } else {
                int val = hm.get(a[i]);
                hm.put(a[i], ++val);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (hm.get(a[i]) > a.length / 2) {
                return a[i];
            }
        }

        return -1;
    }
    
    // Optimiztion 2 : Moore Voting Algo
    static int findMajorityOptimized(int a[]) {
        int candidate = a[0];
        int cout = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == candidate) {
                cout++;
            } else {
                cout--;
            }

            if (cout == 0) {
                candidate = a[i];
                cout = 1;
            }
        }

        int freq = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == candidate) {
                freq++;
            }
        }

        return freq > a.length / 2 ? candidate : -1;
    }
}
