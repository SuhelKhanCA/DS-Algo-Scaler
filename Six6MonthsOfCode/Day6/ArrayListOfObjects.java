/* Creating an ArrayList of user defined types */
package Six6MonthsOfCode.Day6;
import java.util.ArrayList;
class Person{ 
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printData(){
        System.out.println("Name = "+ name + "--" + "Age = " + age);
    }
}
public class ArrayListOfObjects{
    public static void main(String[] args) {
        // Declaring pList as a colletion of type Person
        //ArrayList<Person> pList = new ArrayList<Person>("Sunit", 22); // no suitable constructor found for ArrayList(String,int)
        ArrayList<Person> pList = new ArrayList<Person>();
        pList.add(new Person("Sunit", 22));
        pList.add(new Person("Ram", 25)); // add an object of Person class
        Person p1 = new Person("Sita", 23);
        pList.add(p1);
        // No issues to accomodate list grows dynamically

        // System.out.println(pList); //==>> prints - [Six6MonthsOfCode.Day6.Person@1eb44e46, ...]

        pList.forEach(p -> p.printData()); // A way to access each object in a class
    }
}