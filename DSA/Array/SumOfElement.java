package DSA.Array;

class SumOfElement {
    public static void main(String[] args) {
        int arr[] = {2, 34, 56, 4, 98};

        System.out.println("Sum is: "+ finSum(arr));
    }

    public static int finSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}