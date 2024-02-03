package Six6MonthsOfCode.Day10;
import java.util.Arrays;
public class RangeCopyArrays {
    public static void main(String[] args) { // use of Arrays.copyOfRange() method
        int intArr[] = {10, 20, 30, 11, 55, 56}; // get an array of int
    // printing the given array
    System.out.println("Integer array is : " + Arrays.toString(intArr));
    System.out.println("\nNew Arrays by copyOfRange(): \n");
    // to copy the array into the an array of new length
    System.out.println("Integer Arrray is : " + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
    }
}
