package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
public class SimpleArrayListExample{
    public static void main(String[] args){
        // Creating an ArrayList of String 
        ArrayList<String> animals = new ArrayList<String>();
        // Adding new elements to the arraylist
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        // animals.add(2019); // is this Invalid ==>> error: incompatible types
        // This shows how an entire collection can be displayed
        System.out.println(animals);
    }
}