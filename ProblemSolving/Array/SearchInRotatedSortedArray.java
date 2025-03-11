// https://leetcode.com/problems/search-in-rotated-sorted-array/
class SearchInRotatedSortedArray{
    public static void main(String[] args){
        int [] arr  = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr, target));
    }
    static int search(int[] a, int t){
    
        int minIndex = findMinIndex(a);

        int s = 0;
        int e = minIndex;
        int mid = 0;

        // search in first half
        while(s <= e){
            mid = s + (e-s)/2;

            if(a[mid] == t){
                return mid;
            }else if(t > a[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        // search in second half
        s = minIndex;
        e = a.length-1;
        mid = 0;
        while(s <= e){
            mid = s + (e-s)/2;

            if(a[mid] == t){
                return mid;
            }else if(t > a[mid]){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }

        return -1;
    }
    static int findMinIndex(int[] a){
       int s = 0;
       int e = a.length-1;
       int mid = 0;

       while(s < e){
       mid = s + (e - s)/2;
            if(a[mid] > a[e]){
                s = mid+1;
            }else{
                e = mid;
            }
       }
       return s;
    }
}