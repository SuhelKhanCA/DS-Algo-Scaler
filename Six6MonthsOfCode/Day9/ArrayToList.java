package Six6MonthsOfCode.Day9;
import java.util.Arrays;
public class ArrayToList{ // Convering an array to collection object
    public static void main(String[] args) {
        int[] intArr = {10, 20, 15, 35};
        System.out.println("Integer Array as List: " + Arrays.asList(intArr));
        System.out.println("Integer Array as List: >>> " + Arrays.toString(intArr));
    }
}