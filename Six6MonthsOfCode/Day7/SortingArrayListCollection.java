package Six6MonthsOfCode.Day7;
import java.util.*;
public class SortingArrayListCollection{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Preeti");
        names.add("Jay");
        names.add("Joy");
        names.add("Lemma");
        names.add("Soma");

        System.out.println("Before Sorting : " + names);

        // sort an ArrayList using its sort() method.
        // you must pass a comaparator to the ArrayList.sort() method
        // names.sort(new Comaparator<String>(){ // ERROR: method does not override or implement a method from a supertype
        //     @Override
        //     public int compare(String name1, String name2){
        //         return name1.compareTo(name2);
        //     }
        // });
        names.sort((String name1, String name2)->{
            return name1.compareTo(name2);
        });
        
        System.out.println("After sorting : " +names);
    }
}