package ProblemSolving.BinarySearch;

public class SearchInSortedRotated { // searching an element in an sorted-rotated array
    public static void main(String[] args) {
        int arr[] = {9, 11, 14, 15, 20, 22, 25, 2, 3, 5, 7};
        int target = 14;

        int minIndx = findMin(arr);
        int ans = binarySearch(arr, 0, minIndx -1, target);
        if (ans == -1) {
            ans = binarySearch(arr, minIndx , arr.length -1, target);
        }

        System.out.println("Index : " + ans);
    }

    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (arr[mid] < arr[right]) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    // step : 2
    public static int binarySearch(int[] arr, int left, int right, int target){
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
