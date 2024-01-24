/* Deletion from array lsit */
package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
public class DeletionFromArrayList {
    public static void main(String[] args) {
        // create a collection. Initially empty
        ArrayList<String> langs = new ArrayList<String>();

        // Add elements to the collecion
        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        //langs.add("Java");
        langs.add("Smalltalk");
        System.out.println("Initial list : "+ langs);

        // Removing elements from the collection
        langs.remove(5); // Remove the elements at index 5
        System.out.println("After remove(5) : " + langs);
        langs.add("Smalltalk");
        // Remove the first occurence of the given element from the ArrayList
        boolean status = langs.remove("Smaltalk");
        System.out.println("Smalltalk is removed : " + status);

        // Remove all the elements that exist in a given collection
        ArrayList<String> script = new ArrayList<String>();
        script.add("SQL");
        script.add("Python");
        script.add("JavaScript");
        System.out.println("All the 'script' scripting language : " + script);
        langs.removeAll(script); // remove the intersection of langs and script
        System.out.println("After scripting language removal: " + langs);

        // Remove all the elements that satisfy the given predicate

        // langs.removeIf(new Predicate<String>() { // Error: method does not override or implement a method from a supertype
        //     @Override
        //     public boolean test(String s) {
        //         return s.startsWith("C");
        //     }
        // });
        /* The above removeIf() call can also be written using lambda expression like this :
         * langs.removeIf(s -> s.startsWith("C"));
         */
        langs.removeIf(s -> s.startsWith("C"));
        System.out.println("After removing all the elements that start with \"C\" " + langs);

        // remove all the elements from ArrayList
        langs.clear();
        System.out.println("Is list empty ? : " + langs.isEmpty());
    }
    
}