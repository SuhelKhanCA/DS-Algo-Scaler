package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion1DArray {
    int[] a = new int[100]; // An integer with default 100 capacity
    int size = 0; // the number of the items present 
    public void create(int size){ // static
        if(size > 100){
            System.out.println("Could not initiallize..");
            // return 0;
        }
        this.size = size;
        Scanner in = new Scanner(System.in); // to read from keyboard
        System.out.print("Enter the elements:");
        for (int i = 0; i < size; i++) {
            
            a[i] = in.nextInt(); //load the ith entry
        }
        System.out.println("Capacity = " + a.length + " -- Size = "+ size);
        System.out.println(Arrays.toString(a)); // display the array on the screen
    }

    public  void insert(int loc){ // insertion at the location of the array === static
        if(size == a.length){
            System.out.println("Insertion is overflow : failed to insert..");
            // return 0;
        }
        if (loc < 0 || loc > size) {
            System.out.println("Out of range: Inertion fails..");
            // return 0;
        }
        Scanner in = new Scanner(System.in); // to read from the keyboard
        System.out.println("Enter the item to be inserted: ");
        int item = in.nextInt();
        for(int i = loc; i < a.length-1; i++)
            a[i+1] = a[i]; // shift right
        a[loc] = item;

        System.out.println("Capacity = "+ a.length + " -- Size = "+size);
        System.out.println(Arrays.toString(a)); // Display the elements after insertion
        in.close();
    }
// main method
    public static void main(String[] args) {
        Insertion1DArray obj1 = new Insertion1DArray();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array..");
        int size = in.nextInt();
        obj1.create(size);

        // call for insertion
        System.out.println("Enter the location at which elements to be inserted: ");
        int loc = in.nextInt();
        obj1.insert(loc);
    }
}
