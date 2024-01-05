public class Change {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        change(arr);
        int n = arr.length;
        for(int i= 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

   static void change(int[] a) {
        a[0]=99;
    }
}