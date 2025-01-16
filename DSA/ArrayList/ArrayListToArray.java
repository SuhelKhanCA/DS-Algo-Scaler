import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {

        // 1. ArrayList to Array
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer[] array = arrayList.toArray(new Integer[0]); 

        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            System.out.print(num + " ");
        }
    }
}