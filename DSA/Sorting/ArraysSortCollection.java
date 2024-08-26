import java.util.*;

class ArraysSortCollection {
    public static void main(String[] args) {
        Integer[] arr = {55, 41, 12, 66, -70, 100};
        List<Integer> list = Arrays.asList(arr);
        
        // Sort the list using Collections.sort()
        Collections.sort(list);
        
        System.out.println("Sorted array is: " + list);
    }

    /*
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(55, 41, 12, 66, -70, 100));
        // Sort the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted array in descending order is: " + list);
 
    */
}
