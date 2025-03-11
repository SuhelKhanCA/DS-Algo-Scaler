class MinInRotatedSortedArray{
    public static void main(String[] args){
       int [] arr  = {11, 14, 15, 20, 22, 25, 100, 2 , 3, 5, 7, 9};
       
       int s = 0;
       int e = arr.length-1;
       int mid = 0;

       while(s < e){
       mid = s + (e - s)/2;
            if(arr[mid] > arr[e]){
                s = mid+1;
            }else{
                e = mid;
            }
       }
       System.out.println("Minimum element is at index: " + s);
       System.out.println("Minimum element is at index: " + e);
    }
}