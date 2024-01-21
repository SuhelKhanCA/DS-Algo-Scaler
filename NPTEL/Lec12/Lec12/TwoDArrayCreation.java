package Lec12;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayCreation {
    int a[][]; // Delclared a 2D array
    int row; // The number of rows
    int col; // The number of columns in the 2D array

    TwoDArrayCreation(int row, int col){
        a = new int[row][col];
        this.row = row;
        this.col = col;
    }
    public void initialize(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  " + row*col+ "  elements : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }
    public void print(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        TwoDArrayCreation obj1 = new TwoDArrayCreation(2, 3);
        obj1.initialize();
        obj1.print();
    }
}
