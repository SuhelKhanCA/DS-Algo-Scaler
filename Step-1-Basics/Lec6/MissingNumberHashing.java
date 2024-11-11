public class MissingNumberHashing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 10, 15 };
        int[] hash = createHash(arr);
        
        // fetch from hash
        fetchMissing(hash);
    }

    static void fetchMissing(int[] hash) {
        for (int i = 1; i < hash.length; i++) {
            if (hash[i] == 0) {
                System.out.println(i);
            }
        }
    }
    static int[] createHash(int[] a) {
        int[] hash = new int[16];

        for (int i = 0; i < a.length; i++) {
            hash[a[i]]++;
        }

        return hash;
    }
}
