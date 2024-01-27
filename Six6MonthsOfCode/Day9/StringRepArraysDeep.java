package Six6MonthsOfCode.Day9;
import java.util.Arrays;;
public class StringRepArraysDeep { // deep arrays to String Objects
    public static void main(String[] args) {
        // get the array
        // int intarr[] = {14, 45, 65, 88}; // error: incompatible types: int[] cannot be converted to Object[]
        int intarr[][] = { {14, 45, 65, 88} };

        // to get the deep String of Objects
        System.out.println("Integer arrays: "+ Arrays.deepToString(intarr)); 
    }
}
