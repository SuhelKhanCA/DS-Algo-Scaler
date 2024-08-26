import java.util.Arrays;
class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {55, 41, 12, 66, -70, 100};

        System.out.println("Sorted array is: " + Arrays.toString(sortSelection(arr)));
    }

    static int[] sortSelection(int[] a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        return a;                                
    }    
}