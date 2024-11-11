public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 10, 15};
        int[] hash = createHash(arr);

        // fetch from hash
        fetchMissing(arr, hash, 15);
    }

    static int[] createHash(int[] a) {
        int[] hash = new int[256];

        for (int i = 0; i < a.length; i++) {
            hash[a[i]]++;
        }

        return hash;
    }
    static void fetchMissing(int[] a, int[] hash, int n) {
        for (int i = 1; i <= 15; i++) {
            if (hash[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
