class SubArrays{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findSubArrays(arr);
    }

    static void findSubArrays(int[] a){
        int start = 0;
        int end = a.length;
        for(int i=0; i< a.length; i++){
            for(int j=0; j<a.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(a[k] + " ");
                }
                 System.out.println();
            }
               
        }
    }    
}