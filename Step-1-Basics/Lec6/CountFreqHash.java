public class CountFreqHash {
    static void makeHash(int a[], int[] hash, int n){
            for (int i = 0; i < a.length; i++) {
                hash[a[i]]++;
            }
        }
    public static void main(String[] args) {
        int[] arr = { 11,3, 3, 4, 15, 6, 9, 11, 15 };
        int n = 15; // maximum element in the array OR upto
        int hash[] = new int[n + 1];
        makeHash(arr, hash, n);
        System.out.println(hash[arr[2]]);
    }
}
