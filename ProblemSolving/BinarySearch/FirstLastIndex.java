package ProblemSolving.BinarySearch;

public class FirstLastIndex {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 4, 4, 5,5 , 5, 5,60, 98};

        int target = 4;
        search(arr, target);
    }
    public static void search(int[] arr, int target){
        int left = 0; int right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                first = mid;
                right = mid -1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        // searching last index
        left = 0;  right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println("First index : "+ first + "    " + "Last index: "+ last);
    }
}
