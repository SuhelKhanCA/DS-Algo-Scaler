public class CountFrequencyExample {
    static int countFreq(int n, int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 11, 23, 23, 4, 15, 6, 9, 11, 15 };
        int num = 15;
        System.out.println(countFreq(num, arr));
    }
}
