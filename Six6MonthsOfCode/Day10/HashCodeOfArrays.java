package Six6MonthsOfCode.Day10;
import java.util.Arrays;
public class HashCodeOfArrays {
    public static void main(String[] args) {
        // Get an array
        int intArr[][] = {{10, 20, 30, 50}};
        // getting deepHashCode of an array
        System.out.println("Integer Arrays : " + Arrays.deepHashCode(intArr));
    }
}
