public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 10, 15 };

        for (int i = 0; i <= 15; i++) {
            int count = findFreq(i, arr);
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    static int findFreq(int i, int[] arr) {
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) {
                count++;
            }
        }
        return count;
    }
}
