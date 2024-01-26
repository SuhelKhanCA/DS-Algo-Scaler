package Six6MonthsOfCode.ProblemSolving;
import java.util.*;
public class RemEven{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
        List numbers = Arrays.asList(arr);
        System.out.println("Before removing : " + numbers);
        for (int i = numbers.size() -1; i >= 0; i--) {
            // if ((numbers.get(i)) % 2 == 0) { // bad operand types for binary operator '%'
           // if ((numbers.get(i)) % 2 == 0) {
            //     numbers.remove(i);
            // }
        }
        System.out.println("After removing : " + numbers);
    }
}