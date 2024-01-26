package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
public class AccesingArrayListObjects{
    public static void main(String[] args){
        ArrayList<String> topCompanies = new ArrayList<String>();
        // check if the ArrayList is Empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("MicroSoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " Companies in the world.");
        System.out.println(topCompanies); // Print the companies names
        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        
        System.out.println("Best company: " + bestCompany);
        String secondCompany = topCompanies.get(1);
        System.out.println("Second best company : " + secondCompany);
        String lastCompany = topCompanies.get(topCompanies.size() - 1); //
        System.out.println("Last company in the list: " + lastCompany);
        
        // Modify the element at a index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}