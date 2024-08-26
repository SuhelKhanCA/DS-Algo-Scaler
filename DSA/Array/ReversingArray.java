import java.util.Arrays;
class ReversingArray{
    public static void main(String[] args) {
        int[] arr = {55, 41, 12, 66, -70, 100};
        System.out.println("Original Array : " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    static void reverseArray(int[] a){
        int left = 0, right = a.length - 1;
        while(left <= right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
}