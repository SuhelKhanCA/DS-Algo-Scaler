import java.util.Arrays;
class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {55, 41, 12, 66, -70, 100};

        System.out.println("Sorted array is: " + Arrays.toString(sortInsertion(arr)));
    }

    static int[] sortInsertion(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j -1];
                        a[j-1] = a[j];
                        a[j] = temp;
                }else{
                    break;
                }
            }
            
        }

        return a;                                
    }    
}