package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
public class ArrayListFromCollectionExample{ // array list from other collection using ArrayList(Collecction c)
    public static void main(String[] args) {
        // Creating a collection first. Let it be the simple method
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        // creating another collection initially with aList collecton
        ArrayList<Integer> numbers = new ArrayList<Integer>(aList);
        numbers.add(13); // Adding two more numbers in the numbers collection
        numbers.add(17);
        
        System.out.println("aList = " + aList); // Now, you have 2 collections
        System.out.println("numbers =  " + numbers); // Printing the  two collections
    }
}