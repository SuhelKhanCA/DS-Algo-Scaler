public class GenericMultiArraysDemo{
    public static void main(String[] args){
        String t[] = {"A", "B", "c"};

        Student s[3];
        s[0] = new Student("Ram", 88, 66, 96);
        s[1] = new Student("Rahim", 88, 89, 77);
        s[2] = new Student("John", 85, 75, 95);

        GenericMultiArrays <String, Student> arrayData = new GenericMultiArrays<String, Student>(t, s);

        // printing data 

        arrayData.printData(t);
        arrayData.reverseArray(t);

        arrayData.printData(s);
        arrayData.reverseArray(s);

        arrayData.printData(t);
        arrayData.printData(t);
    }
}
