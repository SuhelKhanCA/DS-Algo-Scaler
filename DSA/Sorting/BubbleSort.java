import java.util.Arrays;
class BuubleSort{
    public static void main(String[] args) {
        int[] arr = {55, 41, 12, 66, -70, 100};

        System.out.println("Sorted array is: " + Arrays.toString(sortBubble(arr)));
    }

    static int[] sortBubble(int[] a){
        boolean swapped = false;
        for (int i = 0; i < a.length; i++) {
 
            for (int j = 0; j < a.length -1; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                return a;
            }    
        }

        return a;                                
    }    
}