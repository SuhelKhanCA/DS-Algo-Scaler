
public class Student {
    
        String name;
        int marks[3];
        // Constructor
        Student(String s, int m[]){
            name=s;
            marks=m;
        }
        //to print
        void printStudent(){
            System.out.println("Name:"+name);
            System.out.println("Scores:"+ marks[0]+" "+ marks[1]+" " + marks[2]);
        }
    
}