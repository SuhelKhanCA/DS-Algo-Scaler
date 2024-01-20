import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitializationRandomDemo {
    static int[] a = new int[100]; // Declaring a 1D array of size 100
    
    static int MIN =1; // Range of the numbers

    static int MAX =100;

   static int generateRandom(int min, int max){
        int rand = (int)(Math.random()*((max - min)+1)) + min;
        return rand;
    }
    public static void main(String[] args) {
        int size; // Actual size of the array
        Scanner in = new Scanner(System.in); // To read a number from the keyboard
        System.out.print("Enter the size < 100 : ");
        size = in.nextInt(); //  To read the size from user
        for (int i = 0; i < size; i++) {
            a[i] = generateRandom(MIN, MAX); // generate and return random numbers
        }
        System.out.println("capacity = " + a.length + "--- Size: " + size);

       // System.out.print("[");
        for (int i = 0; i < size; i++) {
            //System.out.print(a[i] + " "); // Display the array on the screen
            
        }
        // System.out.print("]");
        System.out.println(Arrays.toString(a));
       
    }
}
