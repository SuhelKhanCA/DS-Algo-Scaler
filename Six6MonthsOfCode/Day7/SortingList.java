package Six6MonthsOfCode.Day7;
import java.util.*;
public class SortingList{
    public static void main(String[] args){
        List<Integer> numbers  = new ArrayList<Integer>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(20);

        System.out.println("Before Sorting : " + numbers);

        // Sorting an ArrayList using collection.sort() method
        Collections.sort(numbers);

        System.out.println("After Sorting : " + numbers);
    }
}