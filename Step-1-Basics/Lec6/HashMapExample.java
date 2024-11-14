import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        int arr[] = { 11, 23, 23, 4, 15, 6, 9, 11, 15 };
        int num = 15;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Frequency of "+ num +" is "+ map.get(num));
    }
}
