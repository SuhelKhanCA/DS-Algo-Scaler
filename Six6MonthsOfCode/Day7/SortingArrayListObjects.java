package Six6MonthsOfCode.Day7;
import java.util.*;
class Person{
    private String name;
    private int age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "{" + "name = " + name + "-- Age = " + age + "}";
    }
}
// main method class
public class SortingArrayListObjects{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Ajay", 40));
        people.add(new Person("Seema", 17));
        people.add(new Person("Sahin", 87));
        people.add(new Person("Akin", 97));
        people.add(new Person("Rachin", 27));

        System.out.println("Person List : " + people);

        // Sort people by thier age
        people.sort((person1, person2)->{
            return person1.getAge() - person2.getAge();
        });
        System.out.println("Sorted Person List by age : " + people);

        //A more concise way of wrting the above sorting fucntion()
        //people.sort(Comparator.comparingInt(Person::getAge));

        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted : " + people);

    }
}