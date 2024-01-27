package Six6MonthsOfCode.Day9;
import java.util.Arrays;
public class StreamRepArrays {
    public static void main(String[] args) {
        // get the array
        int intarrr[] = {10, 20, 30, 40};
        // to get the stream from an array
        System.out.println("Integer array : " + Arrays.stream(intarrr)); // OUTPUT: Integer array : java.util.stream.IntPipeline$Head@4f023edb
    }
}
