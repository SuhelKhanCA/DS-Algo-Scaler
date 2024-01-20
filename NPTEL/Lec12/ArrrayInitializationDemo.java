package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrrayInitializationDemo {
    int[] a = new int[100]; // Declaring of a 1D array of  maximum size 100
    int size; // actual size of the array

    public void loadArray(){
        Scanner in = new Scanner(System.in); // To read input from keyboard
        System.out.println("Enter size < 100");
        size = in.nextInt(); // read the size of the array from user
        a = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enetr the "+ (i+1) +"th number");
            a[i] = in.nextInt();
        }
        System.out.println("Length = "+a.length);
        System.out.println("Array is :"+ Arrays.toString(a));
        in.close();
    }
    public static void main(String[] args) {
        ArrrayInitializationDemo obj1 = new ArrrayInitializationDemo();
        obj1.loadArray();
    }
}
