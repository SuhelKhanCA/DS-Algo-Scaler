package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
class SearchingInArrayList {
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    names.add("John");
    names.add("Alice");
    names.add("Bob");
    names.add("Steve");
    names.add("John");
    names.add("Steve");
    names.add("Maria");
    // Check if an ArrayList contains a given element
    System.out.println("Bob exists? : "+ names.contains("Bob"));
    
    // Find the index of first occurences of an element in an ArrayList
    System.out.println("index of \"Steve\" is : " + names.indexOf("Steve"));

    // Find the index of last occurence of an element in the ArrayList
    System.out.println("Last Inddex of \"John\" : " + names.lastIndexOf("John"));

    }
}