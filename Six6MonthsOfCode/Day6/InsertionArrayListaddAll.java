/* ArrayList inersertion using adAll method */
package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
public class InsertionArrayListaddAll{
    public static void main(String[] args) {
        // creating a collection first, let it be a simple method
        ArrayList<Integer> odd = new ArrayList<>(); // declaring a lsit as collection
        // Adding elements into the Odd collection
        odd.add(1);
        odd.add(3);
        odd.add(5);
        odd.add(7);
        odd.add(9);
        
        System.out.println("Odd =>> " + odd);

        // Creating another collection, say number with elements from odd collection
        ArrayList<Integer> numbers  = new ArrayList<>(odd);
        System.out.println("Same as odd =>> " + numbers);

        //Creating another collection, say even1
        ArrayList<Integer> even1 = new ArrayList<Integer>();
        // Add numbers into the even1 collection
        even1.add(2);
        even1.add(4);
        even1.add(6);
        System.out.println("Even = " + even1);

        // Insert all the elements of even1 collection at the end of number collection
        numbers.addAll(even1);
        System.out.println("Numbers = " + numbers);

        // Creating another collection, say any
        ArrayList<Integer> any  = new ArrayList<Integer>();
        // add numbers to 'any' collection
        any.add(133);
        any.add(117);
        // add the collection 'any' at the 5th location of the collection numbers
        numbers.addAll(5, any);
        // Add an object AT an specific location of the collection numbers
        numbers.add(0,0);
        System.out.println("Number now = " + numbers);

        // What will happen to the following ?
        //numbers.add(100, 999); // =>> Sir: yes it will be inserted --- BUT =>> IndexOutOfBoundsException: Index: 100, Size: 11

    }
}