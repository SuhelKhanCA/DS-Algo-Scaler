class Duplicate{
    public static void main(String[] args){
        int[] arr = {55, 41, 12, 66, -70, 100, 100, 41, -70};
        findDuplicate(arr);
    }
    static void findDuplicate(int[] a){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.print(a[i] + " ");
                }
            }        
        }
    }
}